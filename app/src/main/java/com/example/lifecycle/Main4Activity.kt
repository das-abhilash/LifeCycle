package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Log.d("lifecycle-test","Main4Activity - onCreate")
        startActivity(Intent(this, Main5Activity::class.java))
    }

    override fun onPause() {
        Log.d("lifecycle-test","Main4Activity - onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test","Main4Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test","Main4Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test","Main4Activity - onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main4Activity - onResume")
        super.onResume()
    }
}
