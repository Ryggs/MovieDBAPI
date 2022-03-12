package com.interview.themovieDB.view.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.interview.themovieDB.data.Resource
import com.interview.themovieDB.data.Status
import com.interview.themovieDB.domain.pojo.MovieResult
import com.interview.themovieDB.domain.repository.MovieRepository
import com.interview.themovieDB.view.base.BaseViewModel
import javax.inject.Inject

class FavoriteViewModel @Inject constructor(private val repository: MovieRepository) :
    BaseViewModel() {


    fun getMovieFavorites(): LiveData<Resource<List<MovieResult>>> {
        progressState.postValue(true)
        return Transformations.map(repository.allFavoriteMovie()) {
            progressState.postValue(false)
            Resource(Status.SUCCESS, it, null)
        }
    }

    fun getProgressState(): LiveData<Boolean> = progressState

}