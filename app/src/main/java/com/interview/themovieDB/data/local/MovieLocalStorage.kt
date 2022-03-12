package com.interview.themovieDB.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.interview.themovieDB.domain.pojo.MovieResult

@Database(entities = [(MovieResult::class)], version = 1, exportSchema = false)
abstract class MovieLocalStorage : RoomDatabase() {
    abstract fun movieDao(): Dao
}