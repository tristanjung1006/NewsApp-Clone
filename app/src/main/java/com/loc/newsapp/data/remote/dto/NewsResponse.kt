package com.loc.newsapp.data.remote.dto

import com.loc.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String, // ok
    val totalResults: Int // 14664
)