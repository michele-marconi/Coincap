package com.example.coincap.ui.home

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.coincap.apiservice.RemoteDataSource
import com.example.coincap.apiservice.ResponseApi
import com.example.coincap.data.CoinItem
import com.example.coincap.data.CoinOrder
import java.io.IOException
import retrofit2.HttpException

class CoinSource(private val webService: RemoteDataSource) : PagingSource<Int, CoinItem>() {

    override fun getRefreshKey(state: PagingState<Int, CoinItem>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CoinItem> {
        return try {
            val nextPage = params.key ?: 1
            val coinsList = webService.getFirst10PopularCoins(
                vs_currency = VS_CURRENCY,
                per_page = PER_PAGE,
                page = nextPage,
                order = CoinOrder.market_cap_desc.value
            )
                .let { if (it is ResponseApi.Success<*>) it.item as List<CoinItem> else null }
            LoadResult.Page(
                data = coinsList ?: emptyList(),
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (coinsList?.isEmpty() == true) null else nextPage + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }

    companion object {
        const val VS_CURRENCY = "eur"
        const val PER_PAGE = 10
    }
}