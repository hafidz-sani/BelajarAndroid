package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.hafidzproject.basicandroid.adapter.SimpleListViewAdapter;
import com.hafidzproject.basicandroid.data.Anime;
import com.hafidzproject.basicandroid.databinding.ActivityListViewBinding;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;

    private List<Anime> animeList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

//        Isi data
        animeList.add(new Anime("Hyouka", 8.4));
        animeList.add(new Anime("SAO", 7.6));
        animeList.add(new Anime("Vivy", 8.5));

        binding.rvListView.setLayoutManager(new LinearLayoutManager(this));
        binding.rvListView.setAdapter(new SimpleListViewAdapter(animeList));
    }
}