package com.example.coincap.data.details


import com.squareup.moshi.Json

data class ReposUrl(
    @Json(name = "bitbucket")
    val bitbucket: List<Any>,
    @Json(name = "github")
    val github: List<String>
)