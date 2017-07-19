package com.example.mypc.kotlin1907

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById(R.id.tvHello) as TextView

        tv.text = "11111"

        tv.setOnClickListener {
            tv.visibility = View.GONE
        }
    }
}
