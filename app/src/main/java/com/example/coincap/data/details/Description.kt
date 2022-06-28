package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Description(
    @Json(name = "ar")
    val ar: String,
    @Json(name = "bg")
    val bg: String,
    @Json(name = "cs")
    val cs: String,
    @Json(name = "da")
    val da: String,
    @Json(name = "de")
    val de: String,
    @Json(name = "el")
    val el: String,
    @Json(name = "en")
    val en: String,
    @Json(name = "es")
    val es: String,
    @Json(name = "fi")
    val fi: String,
    @Json(name = "fr")
    val fr: String,
    @Json(name = "he")
    val he: String,
    @Json(name = "hi")
    val hi: String,
    @Json(name = "hr")
    val hr: String,
    @Json(name = "hu")
    val hu: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "it")
    val `it`: String,
    @Json(name = "ja")
    val ja: String,
    @Json(name = "ko")
    val ko: String,
    @Json(name = "lt")
    val lt: String,
    @Json(name = "nl")
    val nl: String,
    @Json(name = "no")
    val no: String,
    @Json(name = "pl")
    val pl: String,
    @Json(name = "pt")
    val pt: String,
    @Json(name = "ro")
    val ro: String,
    @Json(name = "ru")
    val ru: String,
    @Json(name = "sk")
    val sk: String,
    @Json(name = "sl")
    val sl: String,
    @Json(name = "sv")
    val sv: String,
    @Json(name = "th")
    val th: String,
    @Json(name = "tr")
    val tr: String,
    @Json(name = "uk")
    val uk: String,
    @Json(name = "vi")
    val vi: String,
    @Json(name = "zh")
    val zh: String,
    @Json(name = "zh-tw")
    val zhTw: String
)