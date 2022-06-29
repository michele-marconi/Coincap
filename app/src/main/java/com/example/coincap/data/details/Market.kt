package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class Market(
    @field:Json(name = "has_trading_incentive")
    val hasTradingIncentive: Boolean,
    @field:Json(name = "identifier")
    val identifier: String,
    @field:Json(name = "name")
    val name: String
)