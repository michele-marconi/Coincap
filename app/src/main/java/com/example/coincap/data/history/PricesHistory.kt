package com.example.coincap.data.history


import com.squareup.moshi.Json

data class PricesHistory(
    @field:Json(name = "market_caps")
    val marketCaps: List<List<Double>>,
    @field:Json(name = "prices")
    val prices: List<List<Double>>,
    @field:Json(name = "total_volumes")
    val totalVolumes: List<List<Double>>
)