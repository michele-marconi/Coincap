package com.example.coincap.data


import com.squareup.moshi.Json

data class Roi(
    @Json(name = "currency")
    val currency: String,
    @Json(name = "percentage")
    val percentage: Double,
    @Json(name = "times")
    val times: Double
)