package com.example.coincap.apiservice

import com.example.coincap.data.CoinsResponse
import com.example.coincap.data.details.CoinDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinService {
    @GET("coins/markets")
    suspend fun getCoinsList(
        @Query("vs_currency") vs_currency: String,
        @Query("per_page") per_page: Int,
        @Query("page") page: Int
    ): Response<CoinsResponse>

    @GET("coins/{id}")
    suspend fun getCoinDetails(@Path("id") id: Int): Response<CoinDetails>
}