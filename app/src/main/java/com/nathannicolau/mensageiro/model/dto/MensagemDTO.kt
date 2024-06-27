package com.nathannicolau.mensageiro.model.dto

import com.nathannicolau.mensageiro.model.vo.MensagemVO
import java.text.SimpleDateFormat
import java.util.Date

data class MensagemDTO(
    val id_mensgem: Int,
    val id_conversa_mensagem: Long,
    val conteudo_mensagem : String,
    val data_mensagem: String
) {
     fun toMensagemVO() {
         val mensagemVo = MensagemVO(id_mensgem, id_conversa_mensagem, conteudo_mensagem,converterDataMensagem(data_mensagem))
     }

    private fun converterDataMensagem(dataMensagem: String): Date {
        val formatador = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return formatador.parse(dataMensagem)
    }


}
