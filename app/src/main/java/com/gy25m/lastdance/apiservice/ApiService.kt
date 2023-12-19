package com.gy25m.lastdance.apiservice

import com.gy25m.lastdance.model.User
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getJson(): Single<List<User>>
}