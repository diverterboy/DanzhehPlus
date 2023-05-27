package com.utotech.danzhehplus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.utotech.danzhehplus.model.Vocab
import com.utotech.danzhehplus.databinding.ImageMachingRowBinding

class RecyclerImageMatching : RecyclerView.Adapter<RecyclerImageMatching.ImageMatchingVh>() {
    lateinit var binding: ImageMachingRowBinding
    lateinit var txt: String
    lateinit var index: String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageMatchingVh {
        val inflater = LayoutInflater.from(parent.context)
        binding = ImageMachingRowBinding.inflate(inflater, parent, false)
        index=""
        txt = ""
        return ImageMatchingVh()
    }

    override fun onBindViewHolder(holder: ImageMatchingVh, position: Int) {
        val voceb: Vocab = differ.currentList[position]
        holder.setData(voceb.img, voceb.word)
        holder.matchingProcess()
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ImageMatchingVh : RecyclerView.ViewHolder(binding.root) {
        fun setData(item: String, txt: String) {
            Glide.with(binding.root.context).load(item).into(binding.imgMatch)
            binding.txtMatch.text = txt
        }

        fun matchingProcess() {
            binding.imgMatch.setOnClickListener(View.OnClickListener {
                index = position.toString()

                Toast.makeText(binding.root.context,position.toString(),Toast.LENGTH_SHORT).show()

                if (index!= "" && txt!=""){
                    Toast.makeText(binding.root.context, "$index $txt",Toast.LENGTH_SHORT).show()
                    
                }
            })

            binding.txtMatch.setOnClickListener(View.OnClickListener {
                txt = differ.currentList[position].word
                Toast.makeText(binding.root.context,txt,Toast.LENGTH_SHORT).show()

            })

        }
    }


    private val differCallBack = object : DiffUtil.ItemCallback<Vocab>() {
        override fun areItemsTheSame(oldItem: Vocab, newItem: Vocab): Boolean {
            return oldItem == oldItem
        }

        override fun areContentsTheSame(oldItem: Vocab, newItem: Vocab): Boolean {
            return oldItem == newItem
        }
    }
    val differ = AsyncListDiffer(this, differCallBack)
}
