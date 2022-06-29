package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class ReposUrl(
    @field:Json(name = "bitbucket")
    val bitbucket: List<Any>,
    @field:Json(name = "github")
    val github: List<String>
)