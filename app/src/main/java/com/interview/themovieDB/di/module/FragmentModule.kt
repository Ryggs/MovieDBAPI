package com.interview.themovieDB.di.module

import com.interview.themovieDB.view.ui.child.ChildFragment
import com.interview.themovieDB.view.ui.detail.DetailFragment
import com.interview.themovieDB.view.ui.favorite.FavoriteFragment
import com.interview.themovieDB.view.ui.find.FindFragment
import com.interview.themovieDB.view.ui.home.HomeFragment
import com.interview.themovieDB.view.ui.popular.PopularFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {

    @ContributesAndroidInjector
    fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    fun contributeFavoriteFragment(): FavoriteFragment

    @ContributesAndroidInjector
    fun contributeFindFragment(): FindFragment

    @ContributesAndroidInjector
    fun contributePopularFragment(): PopularFragment

    @ContributesAndroidInjector
    fun contributeChildFragment(): ChildFragment

    @ContributesAndroidInjector
    fun contributeDetailFragment(): DetailFragment

}