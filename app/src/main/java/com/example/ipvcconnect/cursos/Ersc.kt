package com.example.ipvcconnect.cursos.

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.estagios.WeSecure
import com.example.ipvcconnect.R

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
        val intent = Intent(this, WeSecure::class.java)
        startActivity(intent)

        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
    }
    fun eurotuxClick(view: View) {
        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
    }
    fun microClick(view: View) {}
    fun chipClick(view: View) {}
    fun BlipClick(view: View) {}
    fun PrimaveraClick(view: View) {}
    fun BoschClick(view: View) {}


}