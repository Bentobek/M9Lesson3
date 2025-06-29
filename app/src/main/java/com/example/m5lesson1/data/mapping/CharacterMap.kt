package com.example.m5lesson1.data.mapping

import com.example.m5lesson1.data.model.CharacterDto
import com.example.m5lesson1.domain.model.Characters

fun CharacterDto.toDomain(): Characters {
    return Characters(
        id = id,
        image = image,
        name = name,
    )
}