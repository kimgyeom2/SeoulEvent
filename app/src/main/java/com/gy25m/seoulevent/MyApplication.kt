package com.gy25m.seoulevent

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

      //  KakaoSdk.init(this, "{NATIVE_APP_KEY}")
    }
}