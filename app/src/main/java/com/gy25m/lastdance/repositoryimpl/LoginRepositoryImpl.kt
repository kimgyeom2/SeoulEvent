package com.gy25m.lastdance.repositoryimpl

import com.gy25m.lastdance.Entitiy.LoginEntity
import com.gy25m.lastdance.apiservice.ApiService
import com.gy25m.lastdance.database.DBManager
import com.gy25m.lastdance.model.User
import com.gy25m.lastdance.repository.LoginRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val database: DBManager
): LoginRepository {

    override fun getData(): Single<List<User>> = apiService.getJson()

    override fun saveData(user: LoginEntity) {
        database.userDao().insert(user)
    }

}