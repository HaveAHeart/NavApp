package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.frag1.*

class frag1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonAct1toAct2f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag1_to_frag2)
        }
        buttonAct1toAct3f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag1_to_frag3)
        }

    }
}