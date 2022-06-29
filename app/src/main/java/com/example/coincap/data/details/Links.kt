package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class Links(
    @field:Json(name = "announcement_url")
    val announcementUrl: List<String>,
    @field:Json(name = "bitcointalk_thread_identifier")
    val bitcointalkThreadIdentifier: Any,
    @field:Json(name = "blockchain_site")
    val blockchainSite: List<String>,
    @field:Json(name = "chat_url")
    val chatUrl: List<String>,
    @field:Json(name = "facebook_username")
    val facebookUsername: String,
    @field:Json(name = "homepage")
    val homepage: List<String>,
    @field:Json(name = "official_forum_url")
    val officialForumUrl: List<String>,
    @field:Json(name = "repos_url")
    val reposUrl: ReposUrl,
    @field:Json(name = "subreddit_url")
    val subredditUrl: String,
    @field:Json(name = "telegram_channel_identifier")
    val telegramChannelIdentifier: String,
    @field:Json(name = "twitter_screen_name")
    val twitterScreenName: String
)