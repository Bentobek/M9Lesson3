package com.example.m5lesson1.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.m5lesson1.data.mapping.toDomain
import com.example.m5lesson1.data.model.CharacterDto
import com.example.m5lesson1.data.remote.ApiService
import com.example.m5lesson1.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CharacterRepositoryImpl(
    private val api: ApiService
) : CharacterRepository {

    override  fun getCharacters(): Flow<List<CharacterDto>>
    {
        return flow {
            try {
            val response = api.getCharacters()
            if (response.results?.isNotEmpty()==true) {
                emit(response.results)
            }
                }catch (e: Exception){
                    e.printStackTrace()
            }
        }.flowOn(Dispatchers.IO)
    }
}