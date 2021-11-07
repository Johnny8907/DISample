package com.raywenderlich.android.droidwiki.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(@Singleton @get:Provides val app: Application)