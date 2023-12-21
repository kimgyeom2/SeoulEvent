package com.gy25m.seoulevent.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserInfo")
data class LoginEntity(
    @PrimaryKey(autoGenerate = true) val no: Int,
    val userId: String,
    val id: String,
    val title:String,
    val body:String
)
