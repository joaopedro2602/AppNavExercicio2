package com.example.navegacao2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class firstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val btnTo2 : Button = view.findViewById(R.id.btnTo2)
        val btnTo3 : Button = view.findViewById(R.id.btnTo3)
        btnTo2.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }
        btnTo3.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }

}