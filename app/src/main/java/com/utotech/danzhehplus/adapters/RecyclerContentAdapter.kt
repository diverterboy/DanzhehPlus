package com.utotech.danzhehplus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.utotech.danzhehplus.fragments.ContentFragmentDirections
import com.utotech.danzhehplus.model.Unit
import com.utotech.danzhehplus.databinding.ContentRowBinding


class RecyclerContentAdapter : RecyclerView.Adapter<RecyclerContentAdapter.ViewHolder>() {
    private lateinit var binding: ContentRowBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
        binding = ContentRowBinding.inflate(view)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Unit = differ.currentList.get(position)
        holder.setData(item)

        binding.card.setOnClickListener(View.OnClickListener {
            val direction = ContentFragmentDirections.actionContentFragmentToGamesFragment(position)

            Navigation.findNavController(binding.root).navigate(direction)

/*            Navigation.findNavController(binding.root)
                .navigate(R.id.action_contentFragment_to_vocabFragment)*/
        })
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {

        fun setData(item: Unit) {
            binding.txtTitle.text = item.unitNum.plus(" ").plus(item.unitName)
        }
    }

    private val differCallBack = object : DiffUtil.ItemCallback<Unit>() {
        override fun areItemsTheSame(oldItem: Unit, newItem: Unit): Boolean {
            return oldItem.unitNum == newItem.unitNum
        }

        override fun areContentsTheSame(oldItem: Unit, newItem: Unit): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)
}