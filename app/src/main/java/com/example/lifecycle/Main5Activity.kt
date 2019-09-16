package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        Log.d("lifecycle-test","Main5Activity - onCreate")
        startActivity(Intent(this, Main6Activity::class.java))
    }

    override fun onPause() {
        Log.d("lifecycle-test","Main5Activity - onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test","Main5Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test","Main5Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test","Main5Activity - onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main5Activity - onResume")
        super.onResume()
    }
}
