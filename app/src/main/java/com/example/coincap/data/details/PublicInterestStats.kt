package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PublicInterestStats(
    @Json(name = "alexa_rank")
    val alexaRank: Int,
    @Json(name = "bing_matches")
    val bingMatches: Any
)