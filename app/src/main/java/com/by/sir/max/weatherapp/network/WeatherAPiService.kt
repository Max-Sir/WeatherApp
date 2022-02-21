package com.by.sir.max.weatherapp.network

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherAPiService {
    const val BASE_URL = "https://api.ambeedata.com/"

    val interceptor by lazy {
        HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }
    }

    val okHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }

    val retrofit by lazy {
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(BASE_URL)
            .build()
    }
}