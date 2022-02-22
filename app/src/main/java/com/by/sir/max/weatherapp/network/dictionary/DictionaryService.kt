package com.by.sir.max.weatherapp.network.dictionary

import com.by.sir.max.weatherapp.network.dictionary.entity.DictionaryDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface DictionaryService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
        "Platform: android"
    )
    @GET(value = "{word}")
    fun getWord(
        @Path(value = "word")
        string: String
    ): Call<DictionaryDto>
}