package com.example.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBar(findViewById(R.id.toolbar_widget) as Toolbar?)
        findViewById(R.id.navigation_view)
    }
}