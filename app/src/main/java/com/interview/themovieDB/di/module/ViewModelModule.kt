package com.interview.themovieDB.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.interview.themovieDB.common.ViewModelFactory
import com.interview.themovieDB.di.key.ViewModelKey
import com.interview.themovieDB.view.ui.child.ChildViewModel
import com.interview.themovieDB.view.ui.detail.DetailViewModel
import com.interview.themovieDB.view.ui.favorite.FavoriteViewModel
import com.interview.themovieDB.view.ui.find.FindViewModel
import com.interview.themovieDB.view.ui.home.HomeViewModel
import com.interview.themovieDB.view.ui.popular.PopularViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun bindHomeViewModel(homeViewModel: HomeViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FavoriteViewModel::class)
    fun bindFavoriteViewModel(favoriteViewModel: FavoriteViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FindViewModel::class)
    fun bindFindViewModel(findViewModel: FindViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    fun bindDetailViewModel(detailViewModel: DetailViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PopularViewModel::class)
    fun bindPopularViewModel(popularViewModel: PopularViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ChildViewModel::class)
    fun bindChildViewModel(childViewModel: ChildViewModel) : ViewModel


    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}