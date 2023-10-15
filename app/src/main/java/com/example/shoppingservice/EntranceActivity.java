package com.example.shoppingservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.shoppingservice.databinding.ActivityEntranceBinding;
import com.example.shoppingservice.manager.MyFragmentManager;

public class EntranceActivity extends AppCompatActivity {

    private ActivityEntranceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEntranceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MyFragmentManager.activity = this;
        MyFragmentManager.openFragment(new StartPageFragment());



    }
}