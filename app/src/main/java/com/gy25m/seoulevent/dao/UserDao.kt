package com.gy25m.seoulevent.dao

import androidx.room.Dao
import androidx.room.Insert
import com.gy25m.seoulevent.entity.LoginEntity

@Dao
interface UserDao {
    @Insert
    fun insert(user: LoginEntity)

}