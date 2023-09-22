package com.example.shoppingservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.shoppingservice.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragmentManager = getSupportFragmentManager();
        openFragment(new HomeFragment());
        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            final int itemId = item.getItemId();
            if (itemId == R.id.bottom_nav_main) {
                openFragment(new HomeFragment());
                return true;
            } else if (itemId == R.id.bottom_nav_desired){
                openFragment(new DesiredFragment());
                return true;
            } else if (itemId == R.id.bottom_nav_search){
                openFragment(new SearchFragment());
                return true;
            }
            return false;
        });
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}