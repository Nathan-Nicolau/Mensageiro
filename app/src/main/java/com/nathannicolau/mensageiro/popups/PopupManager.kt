package com.nathannicolau.mensageiro.popups

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.widget.Button
import android.widget.PopupWindow
import com.nathannicolau.mensageiro.R


class PopupManager(private val context : LayoutInflater) {


    @SuppressLint("MissingInflatedId")
    fun popupNomeUsuarioInvalido(posicaoReferencia : View) {
        val inflater = context
        val popupView = inflater.inflate(R.layout.popup_nome_invalido,null)


        val popupWindow = PopupWindow(popupView,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

        val btnFecharPopup: Button = popupView.findViewById(R.id.btnFecharPopupNomeInvalido)
        btnFecharPopup.setOnClickListener { popupWindow.dismiss() }

        popupWindow.isFocusable = true
        popupWindow.isOutsideTouchable = true
        addFadeOutAnimation(popupView,12000)
        popupWindow.showAsDropDown(posicaoReferencia,0,0,Gravity.NO_GRAVITY)
    }

    private fun addFadeOutAnimation(popupView: View, duration: Long) {
        val fadeOut = ObjectAnimator.ofFloat(popupView, "alpha", 1f, 0f)
        fadeOut.duration = duration
        fadeOut.interpolator = DecelerateInterpolator()
        fadeOut.start()
    }


}