package com.example.m5lesson1.domain.repository

import com.example.m5lesson1.domain.model.Characters

interface CharacterRepository {
    suspend fun getCharacters(): List<Characters>
}