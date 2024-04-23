package com.loc.newsapp.domain.manager.usecases

import com.loc.newsapp.domain.manager.LocalUserManager

class SavedAppEntry (
    // here we pass the interface not the implementation
    // this what makes it testable
    // we can just pass different implementaions of this one(interface)
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}