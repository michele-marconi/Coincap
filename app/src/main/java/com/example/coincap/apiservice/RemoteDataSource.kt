package com.example.coincap.apiservice

import com.example.coincap.data.CoinItem
import com.example.coincap.data.details.CoinDetails
import com.example.coincap.data.history.PricesHistory
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber

class RemoteDataSource {

    private var client: CoinService
    private val endpoint = "https://api.coingecko.com/api/v3/"

    init {
        val oAuthClient = OkHttpClient.Builder()
            // not needed here
            // .addInterceptor(HeaderInterceptor())
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(endpoint)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(oAuthClient)
            .build()

        client = retrofit.create(CoinService::class.java)
    }

    private suspend fun <T> getResponse(call: suspend () -> Response<T>): ResponseApi<T?> {
        return runCatching {
            val result = call()
            if (result.isSuccessful) {
                ResponseApi.Success(result.body())
            } else {
                ResponseApi.Error(result.errorBody().toString())
            }
        }.getOrElse {
            Timber.e(it.message)
            ResponseApi.Error(it.message ?: "errorResponse")
        }
    }

    suspend fun getCoins(
        vs_currency: String,
        per_page: Int,
        page: Int,
        order : String
    ): ResponseApi<List<CoinItem>?> {
        return getResponse { client.getCoinsList(vs_currency, per_page, page, order) }
    }

    suspend fun getCoinHistory(
        id: String,
        vs_currency: String,
        from: String,
        to: String,
    ): ResponseApi<PricesHistory?> {
        return getResponse { client.getCoinHistory(id, vs_currency, from, to) }
    }

    suspend fun getCoinDetails(id: String): ResponseApi<CoinDetails?> {
        return getResponse { client.getCoinDetails(id) }
    }

}