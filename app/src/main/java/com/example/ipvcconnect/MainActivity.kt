package com.example.ipvcconnect

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.app.AppCompatDelegate
import com.example.ipvcconnect.escolas.Estg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun esdlClick(view: View) {

        Toast.makeText(this, "ESDL", Toast.LENGTH_SHORT).show()
    }
    fun esceClick(view: View) {

        Toast.makeText(this, "ESCE", Toast.LENGTH_SHORT).show()
    }
    fun essClick(view: View) {

        Toast.makeText(this, "ESS", Toast.LENGTH_SHORT).show()
    }
    fun esaClick(view: View) {

        Toast.makeText(this, "ESA", Toast.LENGTH_SHORT).show()
    }
    fun eseClick(view: View) {

        Toast.makeText(this, "ESE", Toast.LENGTH_SHORT).show()
    }
    fun estgClick(view: View) {
        val intent = Intent(applicationContext, Estg::class.java)
        startActivity(intent)
    }

}