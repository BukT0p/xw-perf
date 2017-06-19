package com.example.kotlin

import android.app.Application
import android.os.SystemClock
import com.collabora.xwperf.fps_measure_module.MeasurementLogger

class App : Application() {
    companion object {
        lateinit var instance: App
        lateinit var logger: MeasurementLogger
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        logger = MeasurementLogger.getInstance()
        populateData()
    }

    private fun populateData() {
        val startTime = SystemClock.elapsedRealtime()
    }
}