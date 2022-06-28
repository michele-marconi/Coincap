package com.example.coincap.data

enum class CoinOrder(val value: String) {
    market_cap_desc("market_cap_desc"),
    market_cap_asc("market_cap_asc"),
    gecko_desc("gecko_desc"),
    gecko_asc("gecko_asc"),
    volume_asc("volume_asc"),
    volume_desc("volume_desc"),
    id_asc("id_asc"),
    id_desc("id_desc");
}