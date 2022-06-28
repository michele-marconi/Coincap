package com.example.coincap.data


import com.squareup.moshi.Json

data class CoinResponseItem(
    @Json(name = "ath")
    val ath: Double,
    @Json(name = "ath_change_percentage")
    val athChangePercentage: Double,
    @Json(name = "ath_date")
    val athDate: String,
    @Json(name = "atl")
    val atl: Double,
    @Json(name = "atl_change_percentage")
    val atlChangePercentage: Double,
    @Json(name = "atl_date")
    val atlDate: String,
    @Json(name = "circulating_supply")
    val circulatingSupply: Double,
    @Json(name = "current_price")
    val currentPrice: Double,
    @Json(name = "fully_diluted_valuation")
    val fullyDilutedValuation: Long,
    @Json(name = "high_24h")
    val high24h: Double,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: String,
    @Json(name = "last_updated")
    val lastUpdated: String,
    @Json(name = "low_24h")
    val low24h: Double,
    @Json(name = "market_cap")
    val marketCap: Long,
    @Json(name = "market_cap_change_24h")
    val marketCapChange24h: Double,
    @Json(name = "market_cap_change_percentage_24h")
    val marketCapChangePercentage24h: Double,
    @Json(name = "market_cap_rank")
    val marketCapRank: Int,
    @Json(name = "max_supply")
    val maxSupply: Long,
    @Json(name = "name")
    val name: String,
    @Json(name = "price_change_24h")
    val priceChange24h: Double,
    @Json(name = "price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @Json(name = "roi")
    val roi: Roi,
    @Json(name = "symbol")
    val symbol: String,
    @Json(name = "total_supply")
    val totalSupply: Double,
    @Json(name = "total_volume")
    val totalVolume: Long
)