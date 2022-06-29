package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class CommunityData(
    @field:Json(name = "facebook_likes")
    val facebookLikes: Any,
    @field:Json(name = "reddit_accounts_active_48h")
    val redditAccountsActive48h: Int,
    @field:Json(name = "reddit_average_comments_48h")
    val redditAverageComments48h: Double,
    @field:Json(name = "reddit_average_posts_48h")
    val redditAveragePosts48h: Double,
    @field:Json(name = "reddit_subscribers")
    val redditSubscribers: Int,
    @field:Json(name = "telegram_channel_user_count")
    val telegramChannelUserCount: Any,
    @field:Json(name = "twitter_followers")
    val twitterFollowers: Int
)