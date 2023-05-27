package com.utotech.danzhehplus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.utotech.danzhehplus.adapters.RecyclerContentAdapter
import com.utotech.danzhehplus.databinding.FragmentContentBinding
import com.utotech.danzhehplus.util.ModelData

class ContentFragment : Fragment() {
    lateinit var binding: FragmentContentBinding
    lateinit var modelData: ModelData
    private val contentAdapter by lazy {
        RecyclerContentAdapter()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentContentBinding.inflate(layoutInflater,container,false)
        modelData= ModelData()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // set data
        contentAdapter.differ.submitList(modelData.getUnits())


        binding.apply {

        }

        binding.recyclerContents.apply {
            layoutManager = LinearLayoutManager(this@ContentFragment.context)
            adapter = contentAdapter
        }

    }

}