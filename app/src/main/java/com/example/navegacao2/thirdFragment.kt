package com.example.navegacao2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class thirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val btnTo5 : Button = view.findViewById(R.id.btnTo5)
        btnTo5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_fifthFragment)
        }
        return view
    }


}