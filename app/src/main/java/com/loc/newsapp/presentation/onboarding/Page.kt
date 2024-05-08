package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    // drawable resource(preventing from mistake)
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "hi",
        description = "hello",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "hi2",
        description = "hello2",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "hi3",
        description = "hello3",
        image = R.drawable.onboarding3
    )
)