package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.frag2.*

class frag2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag2, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonAct2toAct1f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag2_to_frag1)
        }

        buttonAct2toAct3f.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_frag2_to_frag3)
        }
    }
}