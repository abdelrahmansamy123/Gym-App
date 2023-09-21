package com.android.gym_app

import retrofit2.http.GET


interface GymsApiService {
    @GET("gyms.json")
    suspend fun getGyms(): List<Gym>
}