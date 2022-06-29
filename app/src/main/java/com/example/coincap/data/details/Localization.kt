package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class Localization(
    @field:Json(name = "ar")
    val ar: String,
    @field:Json(name = "bg")
    val bg: String,
    @field:Json(name = "cs")
    val cs: String,
    @field:Json(name = "da")
    val da: String,
    @field:Json(name = "de")
    val de: String,
    @field:Json(name = "el")
    val el: String,
    @field:Json(name = "en")
    val en: String,
    @field:Json(name = "es")
    val es: String,
    @field:Json(name = "fi")
    val fi: String,
    @field:Json(name = "fr")
    val fr: String,
    @field:Json(name = "he")
    val he: String,
    @field:Json(name = "hi")
    val hi: String,
    @field:Json(name = "hr")
    val hr: String,
    @field:Json(name = "hu")
    val hu: String,
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "it")
    val `it`: String,
    @field:Json(name = "ja")
    val ja: String,
    @field:Json(name = "ko")
    val ko: String,
    @field:Json(name = "lt")
    val lt: String,
    @field:Json(name = "nl")
    val nl: String,
    @field:Json(name = "no")
    val no: String,
    @field:Json(name = "pl")
    val pl: String,
    @field:Json(name = "pt")
    val pt: String,
    @field:Json(name = "ro")
    val ro: String,
    @field:Json(name = "ru")
    val ru: String,
    @field:Json(name = "sk")
    val sk: String,
    @field:Json(name = "sl")
    val sl: String,
    @field:Json(name = "sv")
    val sv: String,
    @field:Json(name = "th")
    val th: String,
    @field:Json(name = "tr")
    val tr: String,
    @field:Json(name = "uk")
    val uk: String,
    @field:Json(name = "vi")
    val vi: String,
    @field:Json(name = "zh")
    val zh: String,
    @field:Json(name = "zh-tw")
    val zhTw: String
)