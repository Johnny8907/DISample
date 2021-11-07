package com.raywenderlich.android.droidwiki.di

import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Singleton
    @Provides
    fun provideHomePagePresenter(): HomepagePresenter = HomepagePresenterImpl()

    @Singleton
    @Provides
    fun provideEntryPresenter(): EntryPresenter = EntryPresenterImpl()
}