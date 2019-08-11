package com.example.strongestjanken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start.setOnClickListener{
            onStartButtonTapped(it)
        }
    }

    fun onStartButtonTapped(view: View?){
        val intent = Intent(this, JanlenMain::class.java)
        startActivity(intent)
    }
}
