package com.example.m5lesson1.domain.usecase

import com.example.m5lesson1.domain.model.Characters
import com.example.m5lesson1.domain.repository.CharacterRepository

class GetCharactersUseCase(private val repository: CharacterRepository) {
     suspend fun invoke(): List<Characters> = repository.getCharacters()

}