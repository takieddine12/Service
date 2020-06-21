package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startService.setOnClickListener {
            Intent(this,MyService::class.java).also {
                startService(it)
                Log.d("TAG","Service Started")
            }
        }

        stopService.setOnClickListener {
            Intent(this,MyService::class.java).also {
                stopService(it)
                Log.d("TAG","Service Stopped")
            }
        }
        sendintent.setOnClickListener {
            Intent(this,MyService::class.java).also {
                it.putExtra("EXTRA_DATA",edittext.text.toString())
                startActivity(it)
            }
        }
    }
}