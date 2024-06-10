package com.nathannicolau.mensageiro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var mButtonLogin: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    private fun setupView() {
        this.mButtonLogin = findViewById(R.id.mButtonLogin)
    }

    private fun setupListeners() {
        this.mButtonLogin.setOnClickListener {
            iniciarCadastroAcitivity()
        }
    }

    private fun iniciarCadastroAcitivity() {
        val intent = Intent(this,CadastroActivity::class.java)
        startActivity(intent)
    }
}