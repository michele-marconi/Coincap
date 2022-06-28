package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class Image(
    @field:Json(name = "large")
    val large: String,
    @field:Json(name = "small")
    val small: String,
    @field:Json(name = "thumb")
    val thumb: String
)