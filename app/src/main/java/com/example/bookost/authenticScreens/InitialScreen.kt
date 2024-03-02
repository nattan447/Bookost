package com.example.bookost.authenticScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.bookost.R


class InitialScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_initial_screen, container, false)

        val loginBtn = view.findViewById<Button>(R.id.loginBtn)

        val singupBtn = view.findViewById<Button>(R.id.singupBtn)

        loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_initialScreen_to_login)

        }

        singupBtn.setOnClickListener {
            findNavController().navigate(R.id.action_initialScreen_to_singup)

        }

        return view
    }


}