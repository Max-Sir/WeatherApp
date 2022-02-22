package com.by.sir.max.weatherapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.by.sir.max.weatherapp.network.dictionary.DictionaryService
import com.by.sir.max.weatherapp.network.dictionary.entity.DictionaryDto
import com.by.sir.max.weatherapp.network.service
import com.by.sir.max.weatherapp.network.weather.WeatherService
import com.by.sir.max.weatherapp.network.weather.entity.Weather
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class MainViewModel : ViewModel() {
    val text by lazyOf(MutableLiveData<String>())
    val weatherState by lazyOf(MutableLiveData<Weather>())

    fun getWeather(city: String = "NY") {
        viewModelScope.launch {
            service<WeatherService>().getWeatherByCity(city).enqueue(object : Callback<Weather> {
                override fun onResponse(call: Call<Weather>, response: Response<Weather>) {
                    response.body().let { weather ->
                        text.postValue(weather.toString())
                        Timber.i(text.value)

                    }
                }

                override fun onFailure(call: Call<Weather>, t: Throwable) {
                    text.postValue(t.message ?: "Error while loading data from the server")
                }
            })
        }
    }

    fun getWord(word: String) {
        viewModelScope.launch {
            Timber.plant(Timber.DebugTree())
            service<DictionaryService>().getWord(word).enqueue(
                object : Callback<DictionaryDto> {
                    override fun onResponse(
                        call: Call<DictionaryDto>,
                        response: Response<DictionaryDto>
                    ) {
                        Timber.i(response.message())
                        text.postValue(response.body().toString())
                    }

                    override fun onFailure(call: Call<DictionaryDto>, t: Throwable) {
                        Timber.i(t)
                    }
                }
            )
        }
    }
}