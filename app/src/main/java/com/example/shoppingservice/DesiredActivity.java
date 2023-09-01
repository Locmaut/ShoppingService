package com.example.shoppingservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shoppingservice.adapters.AdsAdapter;
import com.example.shoppingservice.adapters.MainAdapter;
import com.example.shoppingservice.data.Ads;
import com.example.shoppingservice.data.Main;
import com.example.shoppingservice.databinding.ActivityDesiredBinding;
import com.example.shoppingservice.databinding.ActivityMainBinding;

import java.time.LocalDateTime;
import java.util.List;

public class DesiredActivity extends AppCompatActivity {

    private ActivityDesiredBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDesiredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Main> menuList = List.of(
                new Main(R.drawable.menu_main, getString(R.string.main),"main"),
                new Main(R.drawable.menu_desired_green, getString(R.string.desired),"desired"),
                new Main(R.drawable.menu_create, getString(R.string.create),"create"),
                new Main(R.drawable.menu_search, getString(R.string.search),"search"),
                new Main(R.drawable.menu_profile, getString(R.string.profile),"profile")
        );
        MainAdapter mainMenuAdapter = new MainAdapter(this, menuList);
        binding.recyclerViewDesiredMenu.setAdapter(mainMenuAdapter);
        binding.recyclerViewDesiredMenu.setHasFixedSize(true);
        binding.recyclerViewDesiredMenu.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<Ads> desiredList = List.of(
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new Ads(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500,  R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired)

        );
        AdsAdapter desiredAdapter = new AdsAdapter(this, desiredList);
        binding.recyclerViewDesiredAds.setAdapter(desiredAdapter);
        binding.recyclerViewDesiredAds.setLayoutManager(new GridLayoutManager(this, 1));
    }
}