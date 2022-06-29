package com.example.coincap.apiservice

import com.example.coincap.data.CoinItem
import com.example.coincap.data.details.CoinDetails
import com.example.coincap.data.history.PricesHistory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinService {
    @GET("coins/markets")
    suspend fun getCoinsList(
        @Query("vs_currency") vs_currency: String,
        @Query("per_page") per_page: Int,
        @Query("page") page: Int,
        @Query("order") order: String
    ): Response<List<CoinItem>>

    @GET("coins/{id}")
    suspend fun getCoinDetails(@Path("id") id: String): Response<CoinDetails>

    @GET("coins/{id}/market_chart/range")
    suspend fun getCoinHistory(
        @Path("id") id: String,
        @Query("vs_currency") vs_currency: String,
        @Query("from") from: String,
        @Query("to") to: String,
    ): Response<PricesHistory>
}