package com.example.m5lesson1.domain.repository

import com.example.m5lesson1.data.model.CharacterDto
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters(): Flow<List<CharacterDto>>
}