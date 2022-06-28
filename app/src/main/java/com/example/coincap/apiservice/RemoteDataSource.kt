package com.example.coincap.apiservice

import com.example.coincap.data.CoinsResponse
import com.example.coincap.data.details.CoinDetails
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

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
            ResponseApi.Error(it.message ?: "errorResponse")
        }
    }

    suspend fun gelPopularMovies(
        vs_currency: String,
        per_page: Int,
        page: Int
    ): ResponseApi<CoinsResponse?> {
        return getResponse { client.getCoinsList(vs_currency, per_page, page) }
    }

    suspend fun gelCoinDetails(id: Int): ResponseApi<CoinDetails?> {
        return getResponse { client.getCoinDetails(id) }
    }

}