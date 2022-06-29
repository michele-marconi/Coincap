package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class CodeAdditionsDeletions4Weeks(
    @field:Json(name = "additions")
    val additions: Int?,
    @field:Json(name = "deletions")
    val deletions: Int?
)