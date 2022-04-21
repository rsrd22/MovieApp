package com.example.movieapp.repository

import com.example.movieapp.application.AppConstants
import com.example.movieapp.data.model.MovieList
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query("api_key") api_key: String): MovieList

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("api_key") api_key: String): MovieList

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") api_key: String): MovieList
}

object RetrofitClient{
    val webservice by lazy{
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}