package com.example.m5lesson1.data.repository

import com.example.m5lesson1.data.mapping.toDomain
import com.example.m5lesson1.data.remote.ApiService
import com.example.m5lesson1.domain.model.Characters
import com.example.m5lesson1.domain.repository.CharacterRepository

class CharacterRepositoryImpl(private val api: ApiService) : CharacterRepository {

    override suspend fun getCharacters(): List<Characters> {
        return api.getCharacters().results.map { it.toDomain() }
    }
}