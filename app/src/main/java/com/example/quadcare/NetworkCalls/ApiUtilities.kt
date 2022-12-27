package com.example.quadcare.NetworkCalls

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object ApiUtilities {
    private val BASE_URL = "https://quadcareapis.azurewebsites.net/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}