package com.nathannicolau.mensageiro.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import com.nathannicolau.mensageiro.R

class ConfiguracoesActivity : AppCompatActivity() {

    private lateinit var swExigirSenhaAparelho: Switch
    private lateinit var swEmitirNotificaoMensagem: Switch
    private lateinit var swNaoConfirmarLeitura: Switch
    private lateinit var swNaoExibirConexao: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)
        setupViews()
        setupOnCheckdChanges()
    }

    private fun setupViews() {
        this.swExigirSenhaAparelho = findViewById(R.id.swExigirSenhaAparelho)
        this.swEmitirNotificaoMensagem = findViewById(R.id.swEmitirNotificaoMensagem)
        this.swNaoConfirmarLeitura = findViewById(R.id.swNaoConfirmarLeitura)
        this.swNaoExibirConexao = findViewById(R.id.swNaoExibirConexao)

    }

    private fun setupOnCheckdChanges() {
        swExigirSenhaAparelho.run {
            setOnCheckedChangeListener { _, isChecked ->
                salvarExigirSenha(isChecked)
            }
        }

        swEmitirNotificaoMensagem.run {
            setOnCheckedChangeListener {_,isChecked ->
                salvarEmitirNotificacao(isChecked)
            }
        }

        swNaoConfirmarLeitura.run {
            setOnCheckedChangeListener {_,isChecked ->
                salvarNaoConfirmarLeitura(isChecked)
            }
        }

        swNaoExibirConexao.run {
            setOnCheckedChangeListener {_,isChecked ->
                salvarNaoExibirConexao(isChecked)
            }
        }
    }

    private fun salvarExigirSenha(exigeSenha: Boolean) {
        //TODO salvar no banco de dados local a opção, quando alterada
    }

    private fun salvarEmitirNotificacao(emitirNotificacao : Boolean) {
        //TODO salvar no banco de dados local a opção, quando alterada
    }

    private fun salvarNaoConfirmarLeitura(naoConfirmarLeitura: Boolean) {
        //TODO salvar no banco de dados local a opção, quando alterada
    }

    private fun salvarNaoExibirConexao(naoExibirConexao: Boolean) {
        //TODO salvar no banco de dados local a opção, quando alterada
    }
}