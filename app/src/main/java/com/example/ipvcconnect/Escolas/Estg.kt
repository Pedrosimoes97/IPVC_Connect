package com.example.ipvcconnect.Escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.Escolas.Cursos.Ersc
import com.example.ipvcconnect.R

class Estg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_estg)

        val intent = intent

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.estg)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun redesClick(view: View) {
        val intent = Intent(this, Ersc::class.java)
        startActivity(intent)
    }
    fun designAClick(view: View) {
        Toast.makeText(this, "DESIGN ALIMENTAR", Toast.LENGTH_SHORT).show()
    }
    fun designPClick(view: View) {
        Toast.makeText(this, "DESIGN PRODUTO", Toast.LENGTH_SHORT).show()
    }
    fun alimentarClick(view: View) {

        Toast.makeText(this, "ALIMENTAR", Toast.LENGTH_SHORT).show()
    }
    fun itClick(view: View) {
        Toast.makeText(this, "IT", Toast.LENGTH_SHORT).show()
    }
    fun turismoClick(view: View) {
        Toast.makeText(this, "TURISMO", Toast.LENGTH_SHORT).show()
    }

    fun civilClick(view: View) {}
    fun mecanicaClick(view: View) {}
}