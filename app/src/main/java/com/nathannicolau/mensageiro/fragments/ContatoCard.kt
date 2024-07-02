package com.nathannicolau.mensageiro.fragments

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.nathannicolau.mensageiro.R
import com.nathannicolau.mensageiro.activities.ContatosActivity
import com.nathannicolau.mensageiro.activities.ConversaActivity
import com.nathannicolau.mensageiro.model.vo.ContatoVO

class ContatoCard(private val listaContato : List<ContatoVO>,private val activity: ContatosActivity) : RecyclerView.Adapter<ContatoCard.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_contato,parent,false)
        return ViewHolder(view,activity)
    }

    override fun getItemCount(): Int {
        return listaContato.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contato = listaContato[position]
        holder.txtViewNomeContato.text = contato.nomeContato
        holder.txtViewStatusConexaoContato.text = contato.statusContato
    }
    fun getActivity() : ContatosActivity {
        return activity
    }

    class ViewHolder(view: View, activity: ContatosActivity) : RecyclerView.ViewHolder(view) {

        private val imgViewFotoContato: ImageView
        val txtViewNomeContato : TextView
        val txtViewStatusConexaoContato : TextView
        val cardViewContato : MaterialCardView

        init {
            imgViewFotoContato = view.findViewById(R.id.imgViewFotoContato)
            txtViewNomeContato = view.findViewById(R.id.txtViewNomeContato)
            txtViewStatusConexaoContato = view.findViewById(R.id.txtViewStatusConexaoContato)
            cardViewContato = view.findViewById(R.id.cardViewContato)

            cardViewContato.setOnClickListener{
                activity.startActivity(Intent(activity,ConversaActivity::class.java))
            }
        }

    }
}