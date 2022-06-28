package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class PublicInterestStats(
    @field:Json(name = "alexa_rank")
    val alexaRank: Int,
    @field:Json(name = "bing_matches")
    val bingMatches: Any
)