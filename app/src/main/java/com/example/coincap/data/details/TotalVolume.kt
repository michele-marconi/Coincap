package com.example.coincap.data.details


import com.squareup.moshi.Json

data class TotalVolume(
    @Json(name = "aed")
    val aed: Long,
    @Json(name = "ars")
    val ars: Long,
    @Json(name = "aud")
    val aud: Long,
    @Json(name = "bch")
    val bch: Int,
    @Json(name = "bdt")
    val bdt: Long,
    @Json(name = "bhd")
    val bhd: Long,
    @Json(name = "bits")
    val bits: Long,
    @Json(name = "bmd")
    val bmd: Long,
    @Json(name = "bnb")
    val bnb: Int,
    @Json(name = "brl")
    val brl: Long,
    @Json(name = "btc")
    val btc: Int,
    @Json(name = "cad")
    val cad: Long,
    @Json(name = "chf")
    val chf: Long,
    @Json(name = "clp")
    val clp: Long,
    @Json(name = "cny")
    val cny: Long,
    @Json(name = "czk")
    val czk: Long,
    @Json(name = "dkk")
    val dkk: Long,
    @Json(name = "dot")
    val dot: Long,
    @Json(name = "eos")
    val eos: Long,
    @Json(name = "eth")
    val eth: Int,
    @Json(name = "eur")
    val eur: Long,
    @Json(name = "gbp")
    val gbp: Long,
    @Json(name = "hkd")
    val hkd: Long,
    @Json(name = "huf")
    val huf: Long,
    @Json(name = "idr")
    val idr: Long,
    @Json(name = "ils")
    val ils: Long,
    @Json(name = "inr")
    val inr: Long,
    @Json(name = "jpy")
    val jpy: Long,
    @Json(name = "krw")
    val krw: Long,
    @Json(name = "kwd")
    val kwd: Long,
    @Json(name = "link")
    val link: Long,
    @Json(name = "lkr")
    val lkr: Long,
    @Json(name = "ltc")
    val ltc: Int,
    @Json(name = "mmk")
    val mmk: Long,
    @Json(name = "mxn")
    val mxn: Long,
    @Json(name = "myr")
    val myr: Long,
    @Json(name = "ngn")
    val ngn: Long,
    @Json(name = "nok")
    val nok: Long,
    @Json(name = "nzd")
    val nzd: Long,
    @Json(name = "php")
    val php: Long,
    @Json(name = "pkr")
    val pkr: Long,
    @Json(name = "pln")
    val pln: Long,
    @Json(name = "rub")
    val rub: Long,
    @Json(name = "sar")
    val sar: Long,
    @Json(name = "sats")
    val sats: Long,
    @Json(name = "sek")
    val sek: Long,
    @Json(name = "sgd")
    val sgd: Long,
    @Json(name = "thb")
    val thb: Long,
    @Json(name = "try")
    val tryX: Long,
    @Json(name = "twd")
    val twd: Long,
    @Json(name = "uah")
    val uah: Long,
    @Json(name = "usd")
    val usd: Long,
    @Json(name = "vef")
    val vef: Int,
    @Json(name = "vnd")
    val vnd: Long,
    @Json(name = "xag")
    val xag: Int,
    @Json(name = "xau")
    val xau: Int,
    @Json(name = "xdr")
    val xdr: Long,
    @Json(name = "xlm")
    val xlm: Long,
    @Json(name = "xrp")
    val xrp: Long,
    @Json(name = "yfi")
    val yfi: Int,
    @Json(name = "zar")
    val zar: Long
)