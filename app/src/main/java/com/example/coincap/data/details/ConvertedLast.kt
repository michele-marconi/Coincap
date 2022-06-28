package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class ConvertedLast(
    @field:Json(name = "btc")
    val btc: Double,
    @field:Json(name = "eth")
    val eth: Double,
    @field:Json(name = "usd")
    val usd: Double
)