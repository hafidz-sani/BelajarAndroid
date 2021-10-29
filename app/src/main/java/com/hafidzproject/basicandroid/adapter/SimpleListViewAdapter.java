package com.hafidzproject.basicandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hafidzproject.basicandroid.databinding.ItemSampleListViewBinding;

public class SimpleListViewAdapter extends RecyclerView.Adapter<SimpleListViewAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemSampleListViewBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleListViewAdapter.ViewHolder holder, int position) {
        // TODO
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull ItemSampleListViewBinding itemSampleListViewBinding) {
            super(itemSampleListViewBinding.getRoot());
        }
    }
}
