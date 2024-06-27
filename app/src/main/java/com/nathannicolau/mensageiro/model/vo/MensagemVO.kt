package com.nathannicolau.mensageiro.model.vo

import java.util.Date

data class MensagemVO(
    var idMensagem: Int,
    var idConversaMensagem: Long,
    var conteudoMensagem: String,
    var dataMensagem: Date,
)

