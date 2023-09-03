package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("lifecycle-test","Main2Activity - onCreate")
        btn.setOnClickListener {
            startActivity(Intent(this, Main3Activity::class.java))
        }
    }





    override fun onPause() {
        Log.d("lifecycle-test","Main2Activity - onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test","Main2Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test","Main2Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test","Main2Activity - onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main2Activity - onResume")
        super.onResume()
    }
}
