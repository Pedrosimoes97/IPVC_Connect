package com.example.ipvcconnect.Escolas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ipvcconnect.Cursos.Ersc
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

    fun DA(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun DP(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun EA(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun ECA(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun ECGM(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun ERSC(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun EI(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun EM(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun EME(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun G(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun T(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
    fun GAC(view: View) {val intent = Intent(applicationContext, Ersc::class.java)
        startActivity(intent)}
}