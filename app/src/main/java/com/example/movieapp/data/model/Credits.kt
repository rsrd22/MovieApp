package com.example.movieapp.data.model

data class Credits(
    val id: Int = -1,
    val adult: Boolean = false,
    val gender: Int = -1,
    val known_for_department: String = "",
    val name: String = "",
    val original_name: String = "",
    val popularity: Double = -1.0,
    val profile_path: String = "",
    val cast_id: Int = -1,
    val character: String = "",
    val credit_id: String = "",
    val order:  Int = -1
)