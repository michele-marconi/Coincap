package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class CoinDetails(
    @field:Json(name = "additional_notices")
    val additionalNotices: List<Any>,
    @field:Json(name = "asset_platform_id")
    val assetPlatformId: Any,
    @field:Json(name = "block_time_in_minutes")
    val blockTimeInMinutes: Int,
    @field:Json(name = "categories")
    val categories: List<String>,
    @field:Json(name = "coingecko_rank")
    val coingeckoRank: Int,
    @field:Json(name = "coingecko_score")
    val coingeckoScore: Double,
    @field:Json(name = "community_data")
    val communityData: CommunityData,
    @field:Json(name = "community_score")
    val communityScore: Double,
    @field:Json(name = "country_origin")
    val countryOrigin: String,
    @field:Json(name = "description")
    val description: Description,
    @field:Json(name = "developer_data")
    val developerData: DeveloperData,
    @field:Json(name = "developer_score")
    val developerScore: Double,
    @field:Json(name = "genesis_date")
    val genesisDate: String,
    @field:Json(name = "hashing_algorithm")
    val hashingAlgorithm: String,
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "image")
    val image: Image,
    @field:Json(name = "last_updated")
    val lastUpdated: String,
    @field:Json(name = "links")
    val links: Links,
    @field:Json(name = "liquidity_score")
    val liquidityScore: Double,
    @field:Json(name = "localization")
    val localization: Localization,
    @field:Json(name = "market_cap_rank")
    val marketCapRank: Int,
    @field:Json(name = "market_data")
    val marketData: MarketData,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "platforms")
    val platforms: Platforms,
    @field:Json(name = "public_interest_score")
    val publicInterestScore: Double,
    @field:Json(name = "public_interest_stats")
    val publicInterestStats: PublicInterestStats,
    @field:Json(name = "public_notice")
    val publicNotice: Any,
    @field:Json(name = "sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double,
    @field:Json(name = "sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double,
    @field:Json(name = "status_updates")
    val statusUpdates: List<Any>,
    @field:Json(name = "symbol")
    val symbol: String,
    @field:Json(name = "tickers")
    val tickers: List<Ticker>
)