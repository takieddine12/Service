package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service(){



    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val DataString = intent?.getStringExtra("EXTRA_DATA")
        DataString?.let {
            Log.d("TAG","Data $DataString")
        }

        Thread {
            while (true){

            }
        }.start()

        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null

}