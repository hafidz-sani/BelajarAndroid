package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.hafidzproject.basicandroid.adapter.SimpleListViewAdapter;
import com.hafidzproject.basicandroid.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.rvListView.setLayoutManager(new LinearLayoutManager(this));
        binding.rvListView.setAdapter(new SimpleListViewAdapter());
    }
}