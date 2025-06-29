package com.example.m5lesson1.data.remote

import com.example.m5lesson1.data.model.CharacterResponseDto
import retrofit2.http.GET

abstract class ApiService {
    @GET("character")
    abstract suspend fun getCharacters(): CharacterResponseDto
}