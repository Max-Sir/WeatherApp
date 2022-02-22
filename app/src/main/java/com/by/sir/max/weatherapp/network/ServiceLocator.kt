package com.by.sir.max.weatherapp.network

import com.by.sir.max.weatherapp.network.dictionary.DictionaryApiService
import com.by.sir.max.weatherapp.network.dictionary.DictionaryService
import com.by.sir.max.weatherapp.network.weather.WeatherAPiService
import com.by.sir.max.weatherapp.network.weather.WeatherService
import kotlin.reflect.KClass

object ServiceLocator {
    fun <T> service(service: KClass<*>): T {
        return when (service) {
            WeatherService::class -> {
                WeatherAPiService.retrofit.create(service.java) as T
            }
            DictionaryService::class -> {
                DictionaryApiService.retrofit.create(service.java) as T
            }

            else -> {
                throw NotImplementedError("There isn't such Implementation")
            }
        }
    }
}

inline fun <reified T> service(): T = ServiceLocator.service(T::class)