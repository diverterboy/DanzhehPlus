package com.utotech.danzhehplus.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.utotech.danzhehplus.databinding.VocabImageRowBinding

class PagerVocabAdapter : RecyclerView.Adapter<PagerVocabAdapter.PagerVh>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVh {
        val view = VocabImageRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PagerVh(view)
    }

    override fun onBindViewHolder(holder: PagerVh, position: Int) {
        val item: String = differ.currentList.get(position)
        holder.setData(item)

    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class PagerVh(val binding: VocabImageRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(item: String) {
            Glide.with(binding.root.context).load(item).into(binding.imgVocab)

        }
    }

    private val differCallBack = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)
}