package com.utotech.danzhehplus.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.utotech.danzhehplus.databinding.FragmentCatchingWavesBinding
import com.utotech.danzhehplus.util.Util


class CatchingWavesFragment : Fragment() {

    lateinit var binding: FragmentCatchingWavesBinding
    lateinit var util: Util

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCatchingWavesBinding.inflate(layoutInflater, container, false)
        util = Util()

        util.animWave1(binding.like,requireActivity())

        binding.like.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "like clicked", Toast.LENGTH_SHORT).show()
        })

        return binding.root
    }


}