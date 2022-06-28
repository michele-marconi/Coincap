package com.example.coincap.data.details


import com.squareup.moshi.Json

data class Image(
    @Json(name = "large")
    val large: String,
    @Json(name = "small")
    val small: String,
    @Json(name = "thumb")
    val thumb: String
)