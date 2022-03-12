package com.interview.themovieDB.di.module


import com.interview.themovieDB.view.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun contributeHomeActivity(): HomeActivity
}