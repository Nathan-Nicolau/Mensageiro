package com.nathannicolau.mensageiro.interfaces

import com.nathannicolau.mensageiro.model.dto.MensagemDTO
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitClient {

    @GET("/mensagens")
    fun getTodasMensagens(): Call<List<MensagemDTO>>
}