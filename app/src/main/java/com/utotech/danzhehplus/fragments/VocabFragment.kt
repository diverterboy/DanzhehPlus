package com.utotech.danzhehplus.fragments

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.speech.RecognizerIntent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.utotech.danzhehplus.adapters.PagerVocabAdapter
import com.utotech.danzhehplus.adapters.RecyclerImageMatching
import com.utotech.danzhehplus.adapters.RecyclerPinViewJ
import com.utotech.danzhehplus.model.Vocab
import com.utotech.danzhehplus.databinding.FragmentVocabBinding
import com.utotech.danzhehplus.util.ICalback
import com.utotech.danzhehplus.util.ModelData
import java.util.*


class VocabFragment : Fragment() {
    private val REQUEST_CODE_SPEECH_INPUT = 1
    lateinit var binding: FragmentVocabBinding
    lateinit var modelData: ModelData

    lateinit var mediaPlayer: MediaPlayer

    var isInPracticeTwo: Boolean = false

    //other
    private val args: VocabFragmentArgs by navArgs()
    private val vocabAdapter by lazy {
        PagerVocabAdapter()

    }
    private val ImageMatchingAdapter by lazy {
        RecyclerImageMatching()
    }

    lateinit var vocabWord: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentVocabBinding.inflate(layoutInflater, container, false)
        modelData = ModelData()
        //   binding.pagerVocab.isUserInputEnabled = false
        mediaPlayer = MediaPlayer()
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val num: Int = args.unitNum

        vocabAdapter.differ.submitList(modelData.getUnits().get(num).vocabFlashCardList)
        binding.pagerVocab.adapter = vocabAdapter

        binding.recyclerPics.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.recyclerPics.adapter = ImageMatchingAdapter

        binding.pagerVocab.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                vocabWord = modelData.getUnits().get(num).wordList.get(position)
                if (isInPracticeTwo) {
                    var x = mutableListOf<String>()
                    binding.recyclerPinView.adapter = RecyclerPinViewJ(vocabWord.toList(),
                        ICalback {
                            if (it) {
                                binding.pagerVocab.setCurrentItem(binding.pagerVocab.currentItem + 1)
                            }

                            //  x.add(it.position, it.letter)
                        })


                    binding.btnDone.setOnClickListener(View.OnClickListener {

                    })

                }
                binding.txtVocab.setText(vocabWord)

                mediaPlayerOffline(modelData.getUnits().get(num).wordSoundOffline.get(position))

                binding.btnRepeat.setOnClickListener(View.OnClickListener {

                    speechDeligation()
                })
            }
        })

        binding.pagerVocab.setOnClickListener(View.OnClickListener {
            mediaPlayerOffline(modelData.getUnits()
                .get(num).wordSoundOffline.get(binding.pagerVocab.currentItem))

        })
    }

    private fun playMedia(url: String) {
        mediaPlayer.reset()
        mediaPlayer.setDataSource(url)
        mediaPlayer.prepare()
        mediaPlayer.start()


    }

    private fun mediaPlayerOffline(item: Int) {

        var mediaPlayerO = MediaPlayer.create(activity, item)
        mediaPlayerO.start()

    }

    fun pronouncedCorrectly(answer: String, result: String) {
        if (answer.lowercase().equals(result.lowercase())) {

            if (isInPracticeTwo && binding.pagerVocab.adapter!!.itemCount == binding.pagerVocab.currentItem + 1) {
                binding.linearBase.visibility = View.GONE
                binding.linear.visibility = View.VISIBLE
                ImageMatchingAdapter.differ.submitList(getVocabList(modelData))
            }

            if (binding.pagerVocab.adapter!!.itemCount == binding.pagerVocab.currentItem + 1) {
                isInPracticeTwo = true
                onStageOneFinished(args.unitNum)
            } else {
                binding.pagerVocab.setCurrentItem(binding.pagerVocab.currentItem + 1)
            }
        } else {
            Toast.makeText(context, "you didn't say it correctly , try again", Toast.LENGTH_SHORT)
                .show()
        }
    }


    fun speechDeligation() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)

        // on below line we are passing language model
        // and model free form in our intent
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        )

        // on below line we are passing our
        // language as a default language.
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE,
            Locale.getDefault()
        )

        // on below line we are specifying a prompt
        // message as speak to text on below line.
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak to text")

        // on below line we are specifying a try catch block.
        // in this block we are calling a start activity
        // for result method and passing our result code.
        try {
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT)
        } catch (e: Exception) {
            // on below line we are displaying error message in toast
            Toast
                .makeText(
                    activity, " " + e.message,
                    Toast.LENGTH_SHORT
                )
                .show()
        }
    }

    fun onStageOneFinished(num: Int) {
        binding.pagerVocab.setCurrentItem(0)
        binding.txtVocab.visibility = View.GONE
        binding.recyclerPinView.visibility = View.VISIBLE
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        // in this method we are checking request
        // code with our result code.
        if (requestCode == REQUEST_CODE_SPEECH_INPUT) {
            // on below line we are checking if result code is ok
            if (resultCode == RESULT_OK && data != null) {

                // in that case we are extracting the
                // data from our array list
                val res: ArrayList<String> =
                    data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS) as ArrayList<String>

                // on below line we are setting data
                // to our output text view.

                pronouncedCorrectly(vocabWord, Objects.requireNonNull(res)[0])
            }
        }
    }

    fun getVocabList(modelData: ModelData): MutableList<Vocab> {
        val item = mutableListOf<Vocab>()
        var i = 1

        while (i < modelData.getUnits()[args.unitNum].wordList.size) {
            modelData.getUnits()[args.unitNum].wordList[i]

            val vocab: Vocab = Vocab(modelData.getUnits()[args.unitNum].vocabFlashCardList[i],
                modelData.getUnits()[args.unitNum].wordList[i])
            item.add(vocab)
            i++
        }

        return item
    }}
