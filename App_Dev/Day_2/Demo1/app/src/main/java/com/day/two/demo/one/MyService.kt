package com.day.two.demo.one

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        //Code to come here
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
        return START_STICKY
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }
}