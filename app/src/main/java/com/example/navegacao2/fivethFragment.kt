package com.example.navegacao2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class fivethFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fiveth, container, false)
        val btnTo6 : Button = view.findViewById(R.id.btnTo6)
        btnTo6.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fivethFragment_to_sixthFragment)
        }
        return view
    }


}