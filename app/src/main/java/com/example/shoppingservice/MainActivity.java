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
import com.example.shoppingservice.databinding.ActivityMainBinding;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainAdapter mainMenuAdapter;
    AdsAdapter adsAdapter;
    List<Main> menuList;
    List<Ads> adsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        menuList = List.of(
                new Main(R.drawable.menu_main_green, getString(R.string.main),"main"),
                new Main(R.drawable.menu_desired, getString(R.string.desired),"desired"),
                new Main(R.drawable.menu_create, getString(R.string.create),"create"),
                new Main(R.drawable.menu_search, getString(R.string.search),"search"),
                new Main(R.drawable.menu_profile, getString(R.string.profile),"profile")
        );
        mainMenuAdapter = new MainAdapter(this, menuList);
        binding.recyclerViewMainMenu.setAdapter(mainMenuAdapter);
        binding.recyclerViewMainMenu.setHasFixedSize(true);
        binding.recyclerViewMainMenu.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        menuList = List.of(
                new Main(R.drawable.ellipse, getString(R.string.business_and_services),""),
                new Main(R.drawable.ellipse, getString(R.string.free),""),
                new Main(R.drawable.ellipse, getString(R.string.children_world),""),
                new Main(R.drawable.ellipse, getString(R.string.home_and_garden),""),
                new Main(R.drawable.ellipse, getString(R.string.help),""),
                new Main(R.drawable.ellipse, getString(R.string.electronic),""),
                new Main(R.drawable.ellipse, getString(R.string.beauty_and_health),""),
                new Main(R.drawable.ellipse, getString(R.string.fashion_and_style),""),
                new Main(R.drawable.ellipse, getString(R.string.real_estate),""),
                new Main(R.drawable.ellipse, getString(R.string.work),""),
                new Main(R.drawable.ellipse, getString(R.string.animal),""),
                new Main(R.drawable.ellipse, getString(R.string.transport),""),
                new Main(R.drawable.ellipse, getString(R.string.hobby),"")
        );
        mainMenuAdapter = new MainAdapter(this, menuList);
        binding.recyclerViewCategories.setAdapter(mainMenuAdapter);
        binding.recyclerViewCategories.setHasFixedSize(true);
        binding.recyclerViewCategories.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        adsList = List.of(
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new Ads(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired)
        );
        adsAdapter = new AdsAdapter(this, adsList);
        binding.recyclerViewPremiumAds.setAdapter(adsAdapter);
        binding.recyclerViewPremiumAds.setLayoutManager(new GridLayoutManager(this, 1));


    }
}