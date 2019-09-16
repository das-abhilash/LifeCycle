package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        Log.d("lifecycle-test", "Main6Activity - onCreate")
    }

    override fun onPause() {
        Log.d("lifecycle-test", "Main6Activity - onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test", "Main6Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test", "Main6Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test", "Main6Activity - onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main6Activity - onResume")
        super.onResume()
    }
}
