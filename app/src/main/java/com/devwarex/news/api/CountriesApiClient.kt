package com.devwarex.news.api

import com.devwarex.news.util.EndPoints.REST_COUNTRIES_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CountriesApiClient {

    fun create(): CountriesService =
        Retrofit.Builder()
            .baseUrl(REST_COUNTRIES_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CountriesService::class.java)
}