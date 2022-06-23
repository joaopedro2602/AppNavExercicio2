package com.example.navegacao2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class secondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val btnTo4 : Button = view.findViewById(R.id.btnTo4)
        btnTo4.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_fourthFragment)
        }
        return view
    }


}