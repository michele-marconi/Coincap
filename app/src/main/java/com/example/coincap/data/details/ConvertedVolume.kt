package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConvertedVolume(
    @Json(name = "btc")
    val btc: Double,
    @Json(name = "eth")
    val eth: Double,
    @Json(name = "usd")
    val usd: Int
)