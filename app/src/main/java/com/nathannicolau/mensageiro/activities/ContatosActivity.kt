package com.nathannicolau.mensageiro.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.nathannicolau.mensageiro.R

class ContatosActivity : AppCompatActivity() {

    private lateinit var mButtonSettings: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)
        setupViews()
        setupClickListeners()
    }

    private fun setupViews() {
        this.mButtonSettings = findViewById(R.id.mButtonSettings)
    }

    private fun setupClickListeners() {
        this.mButtonSettings.setOnClickListener {
            startActivity(Intent(this,ConfiguracoesActivity::class.java))
        }
    }
}