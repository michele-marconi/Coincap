package com.example.coincap.data.details


import com.squareup.moshi.Json

data class Market(
    @Json(name = "has_trading_incentive")
    val hasTradingIncentive: Boolean,
    @Json(name = "identifier")
    val identifier: String,
    @Json(name = "name")
    val name: String
)