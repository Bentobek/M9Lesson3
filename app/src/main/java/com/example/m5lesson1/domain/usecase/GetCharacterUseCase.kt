package com.example.m5lesson1.domain.usecase

import androidx.lifecycle.LiveData
import com.example.m5lesson1.data.model.CharacterDto
import com.example.m5lesson1.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetCharactersUseCase(
     private val repository: CharacterRepository
) {

     fun getCharacters(): Flow<List<CharacterDto>> {
          return repository.getCharacters()
     }

}