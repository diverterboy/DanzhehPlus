package com.utotech.danzhehplus.adapters;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utotech.danzhehplus.databinding.PinviewRowBinding;
import com.utotech.danzhehplus.util.ICalback;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RecyclerPinViewJ extends RecyclerView.Adapter<RecyclerPinViewJ.PinViewVh> {

    List<Character> list;
    PinviewRowBinding binding;
    int score;
    ICalback iCalback;
    int i;
    Set<Integer> rd;

    public RecyclerPinViewJ(List<Character> list, ICalback iCalback) {
        this.list = list;
        score = list.size();
        this.iCalback = iCalback;
        i = 0;
        rd = new LinkedHashSet<Integer>();
    }

    @NonNull
    @Override
    public PinViewVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater view = LayoutInflater.from(parent.getContext());
        binding = PinviewRowBinding.inflate(view);

        return new PinViewVh();
    }

    @Override
    public void onBindViewHolder(@NonNull PinViewVh holder, int position) {
        if (position == 0) {
            randList();
        }
        Character item = list.get(position);

        if (!rd.contains(position)) {
            binding.firstPinView.setText(item.toString());
        }

        binding.firstPinView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().toLowerCase().equals(list.get(holder.getAdapterPosition()).toString().toLowerCase())) {
                    i--;
                    if (i == 0) {
                        iCalback.onSuccess(true);
                    }

                }

            }
        });


        if (position == list.size() - 1) {
            rd.clear();
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private void randList() {

        switch (getItemCount()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 2;
            case 6:
                i = 3;
                break;
            case 7:
                i = 3;
                break;
            case 8:
                i = 4;
                break;
            case 9:
                i = 4;
                break;
            case 10:
                i = 5;
                break;
            default:
                i = 5;
        }
        // to create random list
        Random rng = new Random(); // Ideally just create one instance globally
        // Note: use LinkedHashSet to maintain insertion order
        while (rd.size() < i) {
            Integer next = rng.nextInt(getItemCount());
            // As we're adding to a set, this will automatically do a containment check
            rd.add(next);
        }
    }


    class PinViewVh extends RecyclerView.ViewHolder {
        public PinViewVh() {
            super(binding.getRoot());
        }
    }
}
