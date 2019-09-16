package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.d("lifecycle-test","Main3Activity - onCreate")
    }

    override fun onPause() {
        Log.d("lifecycle-test","Main3Activity - onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test","Main3Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test","Main3Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test","Main3Activity - onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main3Activity - onResume")
        super.onResume()
    }
}
