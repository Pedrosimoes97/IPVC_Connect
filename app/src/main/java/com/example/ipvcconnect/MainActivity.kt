package com.example.ipvcconnect

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.app.AppCompatDelegate
import com.example.ipvcconnect.Escolas.Esa
import com.example.ipvcconnect.Escolas.Esce
import com.example.ipvcconnect.Escolas.Esdl
import com.example.ipvcconnect.Escolas.Ese
import com.example.ipvcconnect.Escolas.Ess
import com.example.ipvcconnect.Escolas.Estg

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

        val intent = Intent(this, Esdl::class.java)
        startActivity(intent)
    }
    fun esceClick(view: View) {

        val intent = Intent(this, Esce::class.java)
        startActivity(intent)
    }
    fun essClick(view: View) {

        val intent = Intent(this, Ess::class.java)
        startActivity(intent)
    }
    fun esaClick(view: View) {

        val intent = Intent(this, Esa::class.java)
        startActivity(intent)
    }
    fun eseClick(view: View) {

        val intent = Intent(this, Ese::class.java)
        startActivity(intent)
    }
    fun estgClick(view: View) {

        val intent = Intent(this, Estg::class.java)
        startActivity(intent)
    }

}