package com.example.ipvcconnect.escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.cursos.Agro
import com.example.ipvcconnect.cursos.Bio
import com.example.ipvcconnect.cursos.Ev
import com.example.ipvcconnect.R

class Esa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_esa)
        val intent = intent

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun agroClick(view: View) {
        val intent = Intent(this, Agro::class.java)
        startActivity(intent)
    }
    fun bioClick(view: View) {
        val intent = Intent(this, Bio::class.java)
        startActivity(intent)
    }

    fun evClick(view: View) {
        val intent = Intent(this, Ev::class.java)
        startActivity(intent)
    }
}