package com.example.ipvcconnect

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ersc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_ersc)

        val intent = intent

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ersc)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun secureClick(view: View) {
        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
    }
    fun eurotuxClick(view: View) {}
    fun microClick(view: View) {}
    fun chipClick(view: View) {}
    fun BlipClick(view: View) {}
    fun PrimaveraClick(view: View) {}


}