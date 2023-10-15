package com.example.shoppingservice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingservice.databinding.FragmentRegistrationBinding;
import com.example.shoppingservice.databinding.FragmentStartPageBinding;

public class RegistrationFragment extends Fragment {

    FragmentStartPageBinding binding;

    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentStartPageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}