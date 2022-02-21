package com.by.sir.max.weatherapp.network

import com.by.sir.max.weatherapp.BuildConfig
import com.by.sir.max.weatherapp.network.entity.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherService {
    @Headers(
        "Accept: application/json",
        "Content-Type: application/json",
        "Platform: android",
        "x-api-key: ${BuildConfig.ACCESS_TOKEN}"
    )
    @GET(value = "/latest/by-city")
    fun getWeatherByCity(
        @Query(value = "city")
        city:String
    ): Call<Weather>
}