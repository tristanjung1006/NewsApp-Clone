package com.loc.newsapp.presentation.onboarding

// sent from the UI to ViewModel
sealed class OnBoardingEvent {

    object SaveAppEntry: OnBoardingEvent()
}