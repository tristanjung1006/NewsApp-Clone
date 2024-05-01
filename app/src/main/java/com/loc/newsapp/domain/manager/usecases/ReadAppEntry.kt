package com.loc.newsapp.domain.manager.usecases

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (
    // here we pass the interface not the implementation
    // this what makes it testable
    // we can just pass different implementaions of this one(interface)
    private val localUserManager: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}