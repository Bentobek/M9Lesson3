package com.example.m5lesson1.data.model

data class CharacterDto (
    val id: Int,
    val name: String,
    val image: String,
    val location: String,
    val dead: String,
    val seen: String
)

data class CharacterResponseDto (
    val results: List<CharacterDto>
)