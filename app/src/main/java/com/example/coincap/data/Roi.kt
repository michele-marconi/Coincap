package com.example.coincap.data


import com.squareup.moshi.Json

data class Roi(
    @field:Json(name = "currency")
    val currency: String,
    @field:Json(name = "percentage")
    val percentage: Double,
    @field:Json(name = "times")
    val times: Double
)