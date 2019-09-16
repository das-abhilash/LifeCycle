package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        Log.d("lifecycle-test", "Main7Activity - onCreate")

        btn.setOnClickListener {
            Log.d("lifecycle-test", "show dialog button clicked")
            AlertDialog.Builder(this)
                .setTitle("This is a dialog")
                .setMessage("This is a dialog")
                .setPositiveButton(
                    android.R.string.yes
                ) { _, _ ->
                }
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
    }

    override fun onPause() {
        Log.d("lifecycle-test", "Main7Activity - onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d("lifecycle-test", "Main7Activity - onResume")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("lifecycle-test", "Main7Activity - onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d("lifecycle-test", "Main7Activity - onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d("lifecycle-test", "Main7Activity - onStop")
        super.onStop()
    }
}
