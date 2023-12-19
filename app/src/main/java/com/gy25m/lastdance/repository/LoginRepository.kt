package com.gy25m.lastdance.repository

import com.gy25m.lastdance.Entitiy.LoginEntity
import com.gy25m.lastdance.model.User
import io.reactivex.rxjava3.core.Single

interface LoginRepository  {

    fun getData(): Single<List<User>>

    fun saveData(user: LoginEntity)
}