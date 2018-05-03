package com.example.mysecondapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mysecondapp.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        button.setOnClickListener {
            button.text = "クリック済み $count"
            count.inc()
        }
    }
}
