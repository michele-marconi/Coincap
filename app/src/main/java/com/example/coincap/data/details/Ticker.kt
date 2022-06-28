package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class Ticker(
    @field:Json(name = "base")
    val base: String,
    @field:Json(name = "bid_ask_spread_percentage")
    val bidAskSpreadPercentage: Double,
    @field:Json(name = "coin_id")
    val coinId: String,
    @field:Json(name = "converted_last")
    val convertedLast: ConvertedLast,
    @field:Json(name = "converted_volume")
    val convertedVolume: ConvertedVolume,
    @field:Json(name = "is_anomaly")
    val isAnomaly: Boolean,
    @field:Json(name = "is_stale")
    val isStale: Boolean,
    @field:Json(name = "last")
    val last: Double,
    @field:Json(name = "last_fetch_at")
    val lastFetchAt: String,
    @field:Json(name = "last_traded_at")
    val lastTradedAt: String,
    @field:Json(name = "market")
    val market: Market,
    @field:Json(name = "target")
    val target: String,
    @field:Json(name = "target_coin_id")
    val targetCoinId: String,
    @field:Json(name = "timestamp")
    val timestamp: String,
    @field:Json(name = "token_info_url")
    val tokenInfoUrl: Any,
    @field:Json(name = "trade_url")
    val tradeUrl: String,
    @field:Json(name = "trust_score")
    val trustScore: String,
    @field:Json(name = "volume")
    val volume: Double
)