package com.utotech.danzhehplus.fragments.StarterPages

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.utotech.danzhehplus.MainActivity
import com.utotech.danzhehplus.R
import com.utotech.danzhehplus.databinding.FragmentStarterBinding


class StarterFragment : Fragment() {

    lateinit var binding: FragmentStarterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStarterBinding.inflate(inflater, container, false)

        binding.btnRegister.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_starterFragment_to_sighnUpFragment)
        })

        binding.btnLogin.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_starterFragment_to_loginFragment)
        })

        binding.btnGuest.setOnClickListener(View.OnClickListener {
            startActivity(Intent(activity,MainActivity::class.java))
        })

        return binding.root
    }

}