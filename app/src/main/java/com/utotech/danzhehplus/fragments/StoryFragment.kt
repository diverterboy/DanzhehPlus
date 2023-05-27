package com.utotech.danzhehplus.fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnAttachStateChangeListener
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.google.android.exoplayer2.DefaultRenderersFactory
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerControlView
import com.utotech.danzhehplus.R
import com.utotech.danzhehplus.databinding.FragmentStoryBinding

open class StoryFragment : Fragment() {
    lateinit var binding: FragmentStoryBinding
    private val args: StoryFragmentArgs by navArgs()
    lateinit var mediaItem: MediaItem
    private lateinit var player: ExoPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStoryBinding.inflate(inflater, container, false)

        //fullscreen
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        if (args.whichFragment == "story") {
            mediaItem =
                MediaItem.fromUri("https://utotech.ir/rest//rescorces/SM1/Songs/sm1_unt3_song.mp4")
        } else if (args.whichFragment == "song") {
            mediaItem =
                MediaItem.fromUri("https://utotech.ir/rest//rescorces/SM1/Songs/sm1_unt3_song.mp4")
        }


        player = ExoPlayer.Builder(requireContext()).build()

        binding.idExoPlayerVIew.player = player
        player.setMediaItem(mediaItem);
// Prepare the player.
        player.prepare();

        player.play()


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.idExoPlayerVIew.findViewById<View>(R.id.bt_fullscreen)
            .setOnClickListener(View.OnClickListener {


            })
    }

    override fun onPause() {
        super.onPause()
        player.playWhenReady = false
        player.playbackState
    }

    override fun onResume() {
        super.onResume()
        player.playWhenReady = true
        player.playbackState
    }

}