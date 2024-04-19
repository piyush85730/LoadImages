package com.piyush.loadimagesapp.cache

import android.app.Application

class AppClass : Application() {
    override fun onCreate() {
        super.onCreate()
        LocalCacheStorage.init(this)
    }
}