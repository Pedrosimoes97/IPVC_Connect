package com.example.ipvcconnect.Escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.Cursos.Agro
import com.example.ipvcconnect.Cursos.Da
import com.example.ipvcconnect.Cursos.Dp
import com.example.ipvcconnect.Cursos.Ea
import com.example.ipvcconnect.Cursos.Eca
import com.example.ipvcconnect.Cursos.Ecgm
import com.example.ipvcconnect.Cursos.Ei
import com.example.ipvcconnect.Cursos.Em
import com.example.ipvcconnect.Cursos.Ersc
import com.example.ipvcconnect.Cursos.Gac
import com.example.ipvcconnect.Cursos.Turismo
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
        val intent = Intent(this, Da::class.java)
        startActivity(intent)
    }
    fun designPClick(view: View) {
        val intent = Intent(this, Dp::class.java)
        startActivity(intent)
    }
    fun alimentarClick(view: View) {

        val intent = Intent(this, Ea::class.java)
        startActivity(intent)
    }
    fun agroClick(view: View) {
        val intent = Intent(this, Agro::class.java)
        startActivity(intent)
    }
    fun itClick(view: View) {
        val intent = Intent(this, Ei::class.java)
        startActivity(intent)
    }
    fun turismoClick(view: View) {

        val intent = Intent(this, Turismo::class.java)
        startActivity(intent)
    }

    fun civilClick(view: View) {
        val intent = Intent(this, Eca::class.java)
        startActivity(intent)
    }
    fun ecgmClick(view: View) {
        val intent = Intent(this, Ecgm::class.java)
        startActivity(intent)
    }
    fun mecanicaClick(view: View) {
        val intent = Intent(this, Em::class.java)
        startActivity(intent)

    }
    fun gacClick(view: View) {
        val intent = Intent(this, Gac::class.java)
        startActivity(intent)

    }
}