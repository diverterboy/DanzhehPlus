package com.utotech.danzhehplus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.utotech.danzhehplus.R
import com.utotech.danzhehplus.databinding.FragmentGamesBinding


class GamesFragment : Fragment() {

    lateinit var binding: FragmentGamesBinding

    private val args: VocabFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGamesBinding.inflate(layoutInflater, container, false)

        binding.btnVocab.setOnClickListener(View.OnClickListener {
            val direction = GamesFragmentDirections.actionGamesFragmentToVocabFragment(args.unitNum)
            findNavController().navigate(direction)
        })

        binding.btnCatchingWaves.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_gamesFragment_to_catchingWavesFragment)
        })

        binding.btnAsteroidAttack.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_gamesFragment_to_astroidAttackFragment)
        })

        binding.btnStory.setOnClickListener(View.OnClickListener {
            val direction = GamesFragmentDirections.actionGamesFragmentToStoryFragment("story")
            findNavController().navigate(direction)
        })

        binding.btnSong.setOnClickListener(View.OnClickListener {
            /*    val direction = GamesFragmentDirections.actionGamesFragmentToStoryFragment("song")
                findNavController().navigate(direction)*/
            findNavController().navigate(R.id.action_gamesFragment_to_recordFragment3)
        })


        return binding.root
    }

}