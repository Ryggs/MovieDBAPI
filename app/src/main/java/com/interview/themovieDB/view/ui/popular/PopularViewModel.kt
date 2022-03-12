package com.interview.themovieDB.view.ui.popular

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import com.interview.themovieDB.domain.pagination.MovieDataSourceFactory
import com.interview.themovieDB.domain.pagination.PaginationState
import com.interview.themovieDB.domain.repository.MovieRepository
import com.interview.themovieDB.util.QueryHelper
import com.interview.themovieDB.view.base.BaseViewModel
import javax.inject.Inject

class PopularViewModel @Inject constructor(repository: MovieRepository) : BaseViewModel()  {

    private var movieDataSourceFactory: MovieDataSourceFactory =
        MovieDataSourceFactory(
            MovieRepository.QUERYTAG.DISCOVER,
            QueryHelper.popularMovies(),
            repository
        )

    val moviePagedLiveData = pagedConfig.let {
        LivePagedListBuilder(movieDataSourceFactory,
            it
        ).build()
    }

    val paginationState: LiveData<PaginationState>? =
        Transformations.switchMap(movieDataSourceFactory.movieDataSourceLiveData) { it.getPaginationState() }

    /**
     * Retry possible last paged request (ie: network issue)
     */
    fun refreshFailedRequest() =
        movieDataSourceFactory.getSource()?.retryFailedQuery()

    /**
     * Refreshes all list after an issue
     */
    fun refreshAllList() =
        movieDataSourceFactory.getSource()?.refresh()
}
