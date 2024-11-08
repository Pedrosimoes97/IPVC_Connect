package com.example.ipvcconnect.cursos

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.R

class Bio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = intent

        setContentView(R.layout.activity_bio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bio)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun BiotecnolClick(view: View) {}
    fun Bialclick(view: View) {}
    fun Bluepharmaclick(view: View) {}
}