package com.max.weatherapp.di

import android.content.Context
import com.max.weatherapp.data.local.db.FavouriteCitiesDao
import com.max.weatherapp.data.local.db.FavouriteDatabase
import com.max.weatherapp.data.network.api.ApiFactory
import com.max.weatherapp.data.network.api.ApiService
import com.max.weatherapp.data.repository.FavouriteRepositoryImpl
import com.max.weatherapp.data.repository.SearchRepositoryImpl
import com.max.weatherapp.data.repository.WeatherRepositoryImpl
import com.max.weatherapp.domain.repository.FavouriteRepository
import com.max.weatherapp.domain.repository.SearchRepository
import com.max.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    @[ApplicationScope Binds]
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}
