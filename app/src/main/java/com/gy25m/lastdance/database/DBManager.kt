package com.gy25m.lastdance.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gy25m.lastdance.Entitiy.LoginEntity
import com.gy25m.lastdance.dao.UserDao

@Database(entities = [LoginEntity::class], version = 1)
abstract class DBManager : RoomDatabase() {
    abstract fun userDao(): UserDao
}