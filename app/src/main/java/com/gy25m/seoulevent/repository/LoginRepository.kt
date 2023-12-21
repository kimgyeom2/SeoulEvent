package com.gy25m.seoulevent.repository

import com.gy25m.seoulevent.entity.LoginEntity
import com.gy25m.seoulevent.model.User
import io.reactivex.rxjava3.core.Single

interface LoginRepository  {

    fun getData(): Single<List<User>>

    fun saveData(user: LoginEntity)
}