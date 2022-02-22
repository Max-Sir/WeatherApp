package com.by.sir.max.weatherapp.network.dictionary.entity

data class DefinitionDto(
    val antonyms: List<Any>,
    val definition: String,
    val example: String,
    val synonyms: List<Any>
)