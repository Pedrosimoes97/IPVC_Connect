package com.example.ipvcconnect.escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.cursos.Cf
import com.example.ipvcconnect.cursos.Gdl
import com.example.ipvcconnect.cursos.Mce
import com.example.ipvcconnect.cursos.Oge
import com.example.ipvcconnect.R

class Esce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val intent = intent

        setContentView(R.layout.activity_esce)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.esce)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun cfClick(view: View) {
        val intent = Intent(this, Cf::class.java)
        startActivity(intent)
    }
    fun gdlClick(view: View) {
        val intent = Intent(this, Gdl::class.java)
        startActivity(intent)
    }
    fun mceClick(view: View) {
        val intent = Intent(this, Mce::class.java)
        startActivity(intent)
    }
    fun ogeClick(view: View) {
        val intent = Intent(this, Oge::class.java)
        startActivity(intent)

    }
}