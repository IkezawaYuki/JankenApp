package com.example.strongestjanken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_janlen_main.*
import kotlinx.android.synthetic.main.activity_result.*

class JanlenMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janlen_main)

        gu.setOnClickListener{ onJankenButtonTapped(it) }
        choki.setOnClickListener{ onJankenButtonTapped(it) }
        pa.setOnClickListener { onJankenButtonTapped(it) }

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.edit { clear() }
    }

    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}
