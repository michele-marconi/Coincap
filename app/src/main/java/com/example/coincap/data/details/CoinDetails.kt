package com.example.coincap.data.details


import com.squareup.moshi.Json

data class CoinDetails(
    @Json(name = "additional_notices")
    val additionalNotices: List<Any>,
    @Json(name = "asset_platform_id")
    val assetPlatformId: Any,
    @Json(name = "block_time_in_minutes")
    val blockTimeInMinutes: Int,
    @Json(name = "categories")
    val categories: List<String>,
    @Json(name = "coingecko_rank")
    val coingeckoRank: Int,
    @Json(name = "coingecko_score")
    val coingeckoScore: Double,
    @Json(name = "community_data")
    val communityData: CommunityData,
    @Json(name = "community_score")
    val communityScore: Double,
    @Json(name = "country_origin")
    val countryOrigin: String,
    @Json(name = "description")
    val description: Description,
    @Json(name = "developer_data")
    val developerData: DeveloperData,
    @Json(name = "developer_score")
    val developerScore: Double,
    @Json(name = "genesis_date")
    val genesisDate: String,
    @Json(name = "hashing_algorithm")
    val hashingAlgorithm: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: Image,
    @Json(name = "last_updated")
    val lastUpdated: String,
    @Json(name = "links")
    val links: Links,
    @Json(name = "liquidity_score")
    val liquidityScore: Double,
    @Json(name = "localization")
    val localization: Localization,
    @Json(name = "market_cap_rank")
    val marketCapRank: Int,
    @Json(name = "market_data")
    val marketData: MarketData,
    @Json(name = "name")
    val name: String,
    @Json(name = "platforms")
    val platforms: Platforms,
    @Json(name = "public_interest_score")
    val publicInterestScore: Double,
    @Json(name = "public_interest_stats")
    val publicInterestStats: PublicInterestStats,
    @Json(name = "public_notice")
    val publicNotice: Any,
    @Json(name = "sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double,
    @Json(name = "sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double,
    @Json(name = "status_updates")
    val statusUpdates: List<Any>,
    @Json(name = "symbol")
    val symbol: String,
    @Json(name = "tickers")
    val tickers: List<Ticker>
) {
    override fun toString(): String {
        return """
            id: $id
            name: $name
            description: $description
            marketCapRank: $marketCapRank
            lastUpdated: $lastUpdated
            """.trimIndent()
    }
}