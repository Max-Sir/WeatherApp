package com.by.sir.max.weatherapp.network.dictionary.entity

data class DictionaryItemDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
)