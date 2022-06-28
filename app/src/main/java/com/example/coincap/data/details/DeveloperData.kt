package com.example.coincap.data.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class DeveloperData(
    @field:Json(name = "closed_issues")
    val closedIssues: Int,
    @field:Json(name = "code_additions_deletions_4_weeks")
    val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks,
    @field:Json(name = "commit_count_4_weeks")
    val commitCount4Weeks: Int,
    @field:Json(name = "forks")
    val forks: Int,
    @field:Json(name = "last_4_weeks_commit_activity_series")
    val last4WeeksCommitActivitySeries: List<Int>,
    @field:Json(name = "pull_request_contributors")
    val pullRequestContributors: Int,
    @field:Json(name = "pull_requests_merged")
    val pullRequestsMerged: Int,
    @field:Json(name = "stars")
    val stars: Int,
    @field:Json(name = "subscribers")
    val subscribers: Int,
    @field:Json(name = "total_issues")
    val totalIssues: Int
)