package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class MarketCap(
    @field:Json(name = "aed")
    val aed: Long,
    @field:Json(name = "ars")
    val ars: Long,
    @field:Json(name = "aud")
    val aud: Long,
    @field:Json(name = "bch")
    val bch: Long,
    @field:Json(name = "bdt")
    val bdt: Long,
    @field:Json(name = "bhd")
    val bhd: Long,
    @field:Json(name = "bits")
    val bits: Long,
    @field:Json(name = "bmd")
    val bmd: Long,
    @field:Json(name = "bnb")
    val bnb: Int,
    @field:Json(name = "brl")
    val brl: Long,
    @field:Json(name = "btc")
    val btc: Int,
    @field:Json(name = "cad")
    val cad: Long,
    @field:Json(name = "chf")
    val chf: Long,
    @field:Json(name = "clp")
    val clp: Long,
    @field:Json(name = "cny")
    val cny: Long,
    @field:Json(name = "czk")
    val czk: Long,
    @field:Json(name = "dkk")
    val dkk: Long,
    @field:Json(name = "dot")
    val dot: Long,
    @field:Json(name = "eos")
    val eos: Long,
    @field:Json(name = "eth")
    val eth: Int,
    @field:Json(name = "eur")
    val eur: Long,
    @field:Json(name = "gbp")
    val gbp: Long,
    @field:Json(name = "hkd")
    val hkd: Long,
    @field:Json(name = "huf")
    val huf: Long,
    @field:Json(name = "idr")
    val idr: Long,
    @field:Json(name = "ils")
    val ils: Long,
    @field:Json(name = "inr")
    val inr: Long,
    @field:Json(name = "jpy")
    val jpy: Long,
    @field:Json(name = "krw")
    val krw: Long,
    @field:Json(name = "kwd")
    val kwd: Long,
    @field:Json(name = "link")
    val link: Long,
    @field:Json(name = "lkr")
    val lkr: Long,
    @field:Json(name = "ltc")
    val ltc: Long,
    @field:Json(name = "mmk")
    val mmk: Long,
    @field:Json(name = "mxn")
    val mxn: Long,
    @field:Json(name = "myr")
    val myr: Long,
    @field:Json(name = "ngn")
    val ngn: Long,
    @field:Json(name = "nok")
    val nok: Long,
    @field:Json(name = "nzd")
    val nzd: Long,
    @field:Json(name = "php")
    val php: Long,
    @field:Json(name = "pkr")
    val pkr: Long,
    @field:Json(name = "pln")
    val pln: Long,
    @field:Json(name = "rub")
    val rub: Long,
    @field:Json(name = "sar")
    val sar: Long,
    @field:Json(name = "sats")
    val sats: Long,
    @field:Json(name = "sek")
    val sek: Long,
    @field:Json(name = "sgd")
    val sgd: Long,
    @field:Json(name = "thb")
    val thb: Long,
    @field:Json(name = "try")
    val tryX: Long,
    @field:Json(name = "twd")
    val twd: Long,
    @field:Json(name = "uah")
    val uah: Long,
    @field:Json(name = "usd")
    val usd: Long,
    @field:Json(name = "vef")
    val vef: Long,
    @field:Json(name = "vnd")
    val vnd: Long,
    @field:Json(name = "xag")
    val xag: Long,
    @field:Json(name = "xau")
    val xau: Int,
    @field:Json(name = "xdr")
    val xdr: Long,
    @field:Json(name = "xlm")
    val xlm: Long,
    @field:Json(name = "xrp")
    val xrp: Long,
    @field:Json(name = "yfi")
    val yfi: Int,
    @field:Json(name = "zar")
    val zar: Long
)