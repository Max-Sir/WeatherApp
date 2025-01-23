package com.max.weatherapp.data.repository

import com.max.weatherapp.data.mapper.toEntities
import com.max.weatherapp.data.network.api.ApiService
import com.max.weatherapp.domain.entity.City
import com.max.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}
