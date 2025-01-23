package com.max.weatherapp.data.mapper

import com.max.weatherapp.data.network.dto.CityDto
import com.max.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }
