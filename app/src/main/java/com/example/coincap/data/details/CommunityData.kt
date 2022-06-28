package com.example.coincap.data.details


import com.squareup.moshi.Json

data class CommunityData(
    @Json(name = "facebook_likes")
    val facebookLikes: Any,
    @Json(name = "reddit_accounts_active_48h")
    val redditAccountsActive48h: Int,
    @Json(name = "reddit_average_comments_48h")
    val redditAverageComments48h: Double,
    @Json(name = "reddit_average_posts_48h")
    val redditAveragePosts48h: Double,
    @Json(name = "reddit_subscribers")
    val redditSubscribers: Int,
    @Json(name = "telegram_channel_user_count")
    val telegramChannelUserCount: Any,
    @Json(name = "twitter_followers")
    val twitterFollowers: Int
)