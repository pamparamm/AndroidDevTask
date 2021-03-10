package me.pam.devtask

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    val logTag = "SecondActivityLifecycle"
    private var squareTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(logTag, "onCreate was called")
        val counterData = intent.getStringExtra(COUNTER_DATA)!!.toInt()
        squareTextView = findViewById(R.id.squareText)
        squareTextView?.text = (counterData * counterData).toString()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i(logTag, "onConfigurationChanged was called")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "onStart was called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(logTag, "onRestart was called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(logTag, "onResume was called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "onDestroy was called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "onPause was called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "onStop was called")
    }
}