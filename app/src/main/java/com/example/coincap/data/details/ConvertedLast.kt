package com.example.coincap.data.details


import com.squareup.moshi.Json

data class ConvertedLast(
    @Json(name = "btc")
    val btc: Double,
    @Json(name = "eth")
    val eth: Double,
    @Json(name = "usd")
    val usd: Int
)