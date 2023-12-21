package com.gy25m.seoulevent

import android.content.Context
import androidx.room.Room
import com.gy25m.seoulevent.apiservice.ApiService
import com.gy25m.seoulevent.database.DBManager
import com.gy25m.seoulevent.repository.LoginRepository
import com.gy25m.seoulevent.repositoryimpl.LoginRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// Hilt
@Module
@InstallIn(SingletonComponent::class)
object MyModule {

    @Provides
    @Singleton
    fun provideMyInterface(retrofit: ApiService,appDatabase: DBManager): LoginRepository = LoginRepositoryImpl(retrofit,appDatabase)


    @Provides
    @Singleton
    fun provideRetrofit(): ApiService{
        return  Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): DBManager {
        return Room.databaseBuilder(
            context,
            DBManager::class.java, "database"
        )
            .build()
    }





}