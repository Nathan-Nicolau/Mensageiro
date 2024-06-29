package com.nathannicolau.mensageiro.activities

import android.app.Dialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.widget.Button
import androidx.core.app.DialogCompat
import androidx.core.content.getSystemService
import androidx.fragment.app.DialogFragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialDialogs
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.nathannicolau.mensageiro.R

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
        setupClickListener()
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

    private fun setupClickListener() {
        mButtonConfirmarCadastro.setOnClickListener {

            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_cadastro_concluido)
            dialog.setCancelable(false)
            var mButtonContinuar = dialog.findViewById<MaterialButton>(R.id.mButtonContinuar)
            mButtonContinuar.setOnClickListener {
                startActivity(Intent(this, ContatosActivity::class.java))
                dialog.dismiss()
                finalizarActivity()
            }
            dialog.show()
        }
    }

    private fun finalizarActivity() {
        this.finish()
    }
}