package me.pam.devtask

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

const val COUNTER_DATA = "me.pam.devtask.COUNTER"

class MainActivity : AppCompatActivity() {
    val logTag = "MainActivityLifecycle"
    private var counter = 0
    private var counterTextView: TextView? = null
    private var activityButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(logTag, "onCreate was called")
        counterTextView = findViewById(R.id.counterText)
        counterTextView?.text = counter.toString()
        activityButton = findViewById(R.id.activityChange)
        activityButton?.setOnClickListener { sendCounter() }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        counter++
        counterTextView?.text = counter.toString()
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

    private fun sendCounter() = startActivity(Intent(this, SecondActivity::class.java).apply {
        putExtra(COUNTER_DATA, counterTextView?.text)
    })
}