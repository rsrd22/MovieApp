package com.example.movieapp.repository

import com.example.movieapp.data.model.MovieList
import com.example.movieapp.data.remote.RemoveMovieDataSource

class MovieRepositoryImpl(private val dataSourceRemove: RemoveMovieDataSource): MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList  = dataSourceRemove.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList  = dataSourceRemove.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList  = dataSourceRemove.getPopularMovies()
}