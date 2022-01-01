package com.example.intentservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tv_textView.text = "Service Running..."
            }
        }

        btn_stop.setOnClickListener {
            MyIntentService.stopService()
            tv_textView.text = "Service Stopped..."
        }

    }
}