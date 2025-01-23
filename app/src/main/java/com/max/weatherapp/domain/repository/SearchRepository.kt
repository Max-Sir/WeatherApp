package com.max.weatherapp.domain.repository

import com.max.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}
