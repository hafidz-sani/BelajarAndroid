package com.hafidzproject.basicandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hafidzproject.basicandroid.data.Anime;
import com.hafidzproject.basicandroid.databinding.ItemSampleListViewBinding;

import java.util.List;

public class SimpleListViewAdapter extends RecyclerView.Adapter<SimpleListViewAdapter.ViewHolder> {


    private List<Anime> animeList;

    public SimpleListViewAdapter(List<Anime> animeList) {
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemSampleListViewBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleListViewAdapter.ViewHolder holder, int position) {
        Anime anime = animeList.get(position);
        holder.itemSampleListViewBinding.tvJudul.setText(anime.getJudul());
        holder.itemSampleListViewBinding.tvRating.setText(String.valueOf(anime.getRating()));
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemSampleListViewBinding itemSampleListViewBinding;

        public ViewHolder(@NonNull ItemSampleListViewBinding itemSampleListViewBinding) {
            super(itemSampleListViewBinding.getRoot());
            this.itemSampleListViewBinding = itemSampleListViewBinding;
        }
    }
}
