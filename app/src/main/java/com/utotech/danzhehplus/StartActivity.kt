package com.utotech.danzhehplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.utotech.danzhehplus.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var navControllerStart: NavController
    lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navControllerStart = findNavController(R.id.startFragmentContainerView)

        }

    }

}