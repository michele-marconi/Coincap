package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeveloperData(
    @Json(name = "closed_issues")
    val closedIssues: Int,
    @Json(name = "code_additions_deletions_4_weeks")
    val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks,
    @Json(name = "commit_count_4_weeks")
    val commitCount4Weeks: Int,
    @Json(name = "forks")
    val forks: Int,
    @Json(name = "last_4_weeks_commit_activity_series")
    val last4WeeksCommitActivitySeries: List<Int>,
    @Json(name = "pull_request_contributors")
    val pullRequestContributors: Int,
    @Json(name = "pull_requests_merged")
    val pullRequestsMerged: Int,
    @Json(name = "stars")
    val stars: Int,
    @Json(name = "subscribers")
    val subscribers: Int,
    @Json(name = "total_issues")
    val totalIssues: Int
)