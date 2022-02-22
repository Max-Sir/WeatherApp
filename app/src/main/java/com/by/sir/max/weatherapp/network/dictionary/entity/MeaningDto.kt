package com.by.sir.max.weatherapp.network.dictionary.entity

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String
)