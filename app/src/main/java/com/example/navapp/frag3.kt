package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.frag3.*

class frag3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonAct3toAct1f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag3_to_frag1)
        }
        buttonAct3toAct2f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag3_to_frag2)
        }
    }
}