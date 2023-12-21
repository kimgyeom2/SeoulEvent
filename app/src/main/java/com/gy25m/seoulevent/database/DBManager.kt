package com.gy25m.seoulevent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gy25m.seoulevent.dao.UserDao
import com.gy25m.seoulevent.entity.LoginEntity

@Database(entities = [LoginEntity::class], version = 1)
abstract class DBManager : RoomDatabase() {
    abstract fun userDao(): UserDao
}