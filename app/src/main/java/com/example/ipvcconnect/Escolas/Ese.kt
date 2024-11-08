package com.example.ipvcconnect.Escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.Cursos.Acdigi
import com.example.ipvcconnect.Cursos.Apta
import com.example.ipvcconnect.Cursos.Eb
import com.example.ipvcconnect.Cursos.Esg
import com.example.ipvcconnect.R

class Ese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = intent

        setContentView(R.layout.activity_ese)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun acdAClick(view: View) {
        val intent = Intent(this, Acdigi::class.java)
        startActivity(intent)
    }
    fun aptaClick(view: View) {
        val intent = Intent(this, Apta::class.java)
        startActivity(intent)
    }
    fun ebClick(view: View) {
        val intent = Intent(this, Eb::class.java)
        startActivity(intent)
    }
    fun esgClick(view: View) {
        val intent = Intent(this, Esg::class.java)
        startActivity(intent)
    }
}