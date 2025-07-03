package com.example.m5lesson1.data.mapping

import com.example.m5lesson1.data.model.CharacterDto
import com.example.m5lesson1.domain.model.Characters

fun CharacterDto.toDomain(): Characters {
    return Characters(
        image, name, dead, location, seen, id,
    )
}