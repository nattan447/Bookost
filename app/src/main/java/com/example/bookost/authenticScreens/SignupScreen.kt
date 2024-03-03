package com.example.bookost.authenticScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.bookost.R


class SignupScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_signup_screen, container, false)

        val btnBack = view.findViewById<ImageButton>(R.id.backToInitialBtn)


        btnBack.setOnClickListener {

            requireActivity().onBackPressed()

        }

        return view
    }


}