package com.interview.themovieDB.view.ui.home.adapter

import com.interview.themovieDB.domain.pojo.MovieResult

interface movieInteractionListener {
    fun onClickRetry()
    fun onMovieClick(movieResult: MovieResult, pos: Int)
}