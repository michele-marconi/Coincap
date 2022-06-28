package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CodeAdditionsDeletions4Weeks(
    @Json(name = "additions")
    val additions: Int,
    @Json(name = "deletions")
    val deletions: Int
)