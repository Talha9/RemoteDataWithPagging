package com.example.getremotedatawithpagging.data.mappers

import com.example.getremotedatawithpagging.data.local.BeerEntity
import com.example.getremotedatawithpagging.data.remote.BeerDto
import com.example.getremotedatawithpagging.domain.Beer


fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}