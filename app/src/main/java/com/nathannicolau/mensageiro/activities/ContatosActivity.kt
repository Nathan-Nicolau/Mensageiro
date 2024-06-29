package com.nathannicolau.mensageiro.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.nathannicolau.mensageiro.R
import com.nathannicolau.mensageiro.fragments.ContatoCard
import com.nathannicolau.mensageiro.model.vo.ContatoVO

class ContatosActivity : AppCompatActivity() {

    private lateinit var listaContatos : RecyclerView
    private lateinit var mButtonSettings: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)
        setupViews()
        setAdaptersContato()
        setupClickListeners()
    }

    private fun setupViews() {
        this.listaContatos = findViewById(R.id.listaContatos)
        this.mButtonSettings = findViewById(R.id.mButtonSettings)
    }

    private fun setupClickListeners() {
        this.mButtonSettings.setOnClickListener {
            startActivity(Intent(this,ConfiguracoesActivity::class.java))
        }
    }

    private fun setAdaptersContato() {
        val lista = listOf(ContatoVO(1,"Helen","Online","vazia"))
        val adapterContato = ContatoCard(lista)
        this.listaContatos.layoutManager = LinearLayoutManager(this)
        this.listaContatos.adapter = adapterContato

    }
}