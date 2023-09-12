package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        * Test 1 :
        * start Main3Activity from Main2Activity and observe lifecycle events
        *
        * Test 2 :
        * press back from Main3Activity and arrive on Main2Activity and observe lifecycle events
        *
        * Test 3 :
        * start Main6Activity from Main5Activity's onCreate() and Main5Activity from Main4Activity's onCreate()
        *
        * Test 4 :
        * start a dialog and observe lifeCycle and observe lifecycle in Main7Activity
        *
        * todo lock screen
        *
        * */

        // Test 1 :
        btn_1.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }

        // Test 2 :
        btn_2.setOnClickListener {
            startActivity(Intent(this, Main4Activity::class.java))
        }

        // Test 3 :
        btn_3.setOnClickListener {
            startActivity(Intent(this, Main7Activity::class.java))
        }
    }
}
