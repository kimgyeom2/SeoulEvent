package com.gy25m.lastdance.dao

import androidx.room.Dao
import androidx.room.Insert
import com.gy25m.lastdance.entity.LoginEntity

@Dao
interface UserDao {
    @Insert
    fun insert(user: LoginEntity)

}