package com.example.shoppingservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingservice.adapters.AdsAdapter;
import com.example.shoppingservice.data.AdsItem;

import java.time.LocalDateTime;
import java.util.List;

public class DesiredFragment extends Fragment {
    RecyclerView adsDesiredRecyclerView;
    AdsAdapter adsDesiredAdapter;
    List<AdsItem> adsDesiredList;

    public DesiredFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_desired, container, false);
        adsDesiredList = generateAdsDesiredItems();
        adsDesiredRecyclerView = rootView.findViewById(R.id.recyclerView_desired_ads);
        AdsAdapter adsDesiredAdapter = new AdsAdapter(adsDesiredList);

        adsDesiredRecyclerView.setAdapter(adsDesiredAdapter);
        return rootView;
    }

    private List<AdsItem> generateAdsDesiredItems() {
        List<AdsItem> adsDesiredItems = List.of(
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new AdsItem(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new AdsItem(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new AdsItem(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new AdsItem(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired)

        );
        return  adsDesiredItems;
    }
}