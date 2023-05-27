package com.utotech.danzhehplus.fragments.StarterPages

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utotech.danzhehplus.MainActivity
import com.utotech.danzhehplus.R
import com.utotech.danzhehplus.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener(View.OnClickListener {

            startActivity(Intent(activity,MainActivity::class.java))
        })

        binding.btnRegister.setOnClickListener(View.OnClickListener {
            startActivity(Intent(activity,MainActivity::class.java))

        })
        return binding.root
    }

}