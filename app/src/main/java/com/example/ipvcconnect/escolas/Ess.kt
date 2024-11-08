package com.example.ipvcconnect.escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.cursos.Enfermagem
import com.example.ipvcconnect.R

class Ess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val intent = intent

        setContentView(R.layout.activity_ess)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ess)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun enfermagemClick(view: View) {
        val intent = Intent(this, Enfermagem::class.java)
        startActivity(intent)

    }
}