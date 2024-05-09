package com.loc.newsapp.domain.repository

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

interface NewsRepository {

    // fetching all articles makes infinite time and resources
    // paging can specify how mant articles we want
    fun getNews(sources: List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>>
}