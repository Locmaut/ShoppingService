package com.example.shoppingservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.shoppingservice.databinding.ActivityAdsPageBinding;

import java.util.List;

public class AdsPageActivity extends AppCompatActivity {
    private ActivityAdsPageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdsPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<SlideModel> slideModels = List.of(
                new SlideModel(R.drawable.one, ScaleTypes.FIT),
                new SlideModel(R.drawable.two, ScaleTypes.FIT)
        );
        binding.imageSliderPageAds.setImageList(slideModels, ScaleTypes.FIT);


    }
}