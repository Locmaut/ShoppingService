package com.example.shoppingservice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingservice.databinding.FragmentStartPageBinding;
import com.example.shoppingservice.manager.MyFragmentManager;


public class StartPageFragment extends Fragment {


    FragmentStartPageBinding binding;

    public StartPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentStartPageBinding.inflate(inflater, container, false);
        binding.buttonSignUp.setOnClickListener(v -> {
            MyFragmentManager.openFragment(new RegistrationFragment());
        });
        return binding.getRoot();
    }
}