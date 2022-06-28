package com.example.coincap.data


import com.squareup.moshi.Json

data class CoinItem(
    @field:Json(name = "ath")
    val ath: Double,
    @field:Json(name = "ath_change_percentage")
    val athChangePercentage: Double,
    @field:Json(name = "ath_date")
    val athDate: String,
    @field:Json(name = "atl")
    val atl: Double,
    @field:Json(name = "atl_change_percentage")
    val atlChangePercentage: Double,
    @field:Json(name = "atl_date")
    val atlDate: String,
    @field:Json(name = "circulating_supply")
    val circulatingSupply: Double,
    @field:Json(name = "current_price")
    val currentPrice: Double,
    @field:Json(name = "fully_diluted_valuation")
    val fullyDilutedValuation: Long?,
    @field:Json(name = "high_24h")
    val high24h: Double,
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "image")
    val image: String,
    @field:Json(name = "last_updated")
    val lastUpdated: String,
    @field:Json(name = "low_24h")
    val low24h: Double,
    @field:Json(name = "market_cap")
    val marketCap: Long,
    @field:Json(name = "market_cap_change_24h")
    val marketCapChange24h: Double,
    @field:Json(name = "market_cap_change_percentage_24h")
    val marketCapChangePercentage24h: Double,
    @field:Json(name = "market_cap_rank")
    val marketCapRank: Int,
    @field:Json(name = "max_supply")
    val maxSupply: Double?,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "price_change_24h")
    val priceChange24h: Double,
    @field:Json(name = "price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @field:Json(name = "roi")
    val roi: Roi,
    @field:Json(name = "symbol")
    val symbol: String,
    @field:Json(name = "total_supply")
    val totalSupply: Double?,
    @field:Json(name = "total_volume")
    val totalVolume: Long
) {
    override fun toString(): String {
        return """
            id: $id
            name: $name
            marketCap: $marketCap
            marketCapRank: $marketCapRank
            ath: $ath
            athDate number: $athDate
            circulatingSupply: $circulatingSupply
            currentPrice: $currentPrice
            """.trimIndent()
    }
}