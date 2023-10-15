package com.example.shoppingservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.shoppingservice.databinding.ActivityMainBinding;
import com.example.shoppingservice.manager.MyFragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MyFragmentManager.activity = this;
        MyFragmentManager.openFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            final int itemId = item.getItemId();
            if (itemId == R.id.bottom_nav_main) {
                MyFragmentManager.openFragment(new HomeFragment());
                return true;
            } else if (itemId == R.id.bottom_nav_desired) {
                MyFragmentManager.openFragment(new DesiredFragment());
                return true;
            } else if (itemId == R.id.bottom_nav_create) {
                MyFragmentManager.openFragment(new AdsCreateFragment());
                return true;
            } else if (itemId == R.id.bottom_nav_search) {
                MyFragmentManager.openFragment(new SearchFragment());
                return true;
            }
            return false;
        });
    }
}