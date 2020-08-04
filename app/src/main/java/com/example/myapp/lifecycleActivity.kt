package com.example.myapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class lifecycleActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    override fun onStart() {
        super.onStart()
        Log.d("Licycle>>>>","onStart......")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Licycle>>>>","onResume......")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Licycle>>>>","onPause......")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Licycle>>>>","onStop......")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Licycle>>>>","onRestart......")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Licycle>>>>","onDestory......")
    }
}