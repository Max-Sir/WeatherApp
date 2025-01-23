package com.max.weatherapp.domain.repository

import com.max.weatherapp.domain.entity.Forecast
import com.max.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}
