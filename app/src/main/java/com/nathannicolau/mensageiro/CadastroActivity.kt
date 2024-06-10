package com.nathannicolau.mensageiro

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.core.content.getSystemService
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.nathannicolau.mensageiro.popups.PopupManager

class CadastroActivity : AppCompatActivity() {

    private lateinit var textInputNome : TextInputLayout
    private lateinit var editTextNomeUsuario: TextInputEditText
    private lateinit var editTextTelefoneUsuario: TextInputEditText
    private lateinit var mButtonConfirmarCadastro : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setupViews()
        setupInsertDados()
    }

    private fun setupViews() {
        textInputNome = findViewById(R.id.textInputNome)
        editTextNomeUsuario = findViewById(R.id.editTextNomeCadastro)
        editTextTelefoneUsuario = findViewById(R.id.editTextTelefoneCadastro)
        mButtonConfirmarCadastro = findViewById(R.id.btnConfirmarCadastro)
    }

    private fun setupInsertDados() {
        val posicaoId = textInputNome


    }
}