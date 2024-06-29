package com.nathannicolau.mensageiro.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nathannicolau.mensageiro.R
import com.nathannicolau.mensageiro.model.vo.ContatoVO

class ContatoCard(private val listaContato : List<ContatoVO>) : RecyclerView.Adapter<ContatoCard.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_contato,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaContato.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contato = listaContato[position]
        holder.txtViewNomeContato.text = contato.nomeContato
        holder.txtViewStatusConexaoContato.text = contato.statusContato
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imgViewFotoContato: ImageView
        val txtViewNomeContato : TextView
        val txtViewStatusConexaoContato : TextView

        init {
            imgViewFotoContato = view.findViewById(R.id.imgViewFotoContato)
            txtViewNomeContato = view.findViewById(R.id.txtViewNomeContato)
            txtViewStatusConexaoContato = view.findViewById(R.id.txtViewStatusConexaoContato)
        }

    }
}