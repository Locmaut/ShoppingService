package com.example.shoppingservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingservice.adapters.AdsAdapter;
import com.example.shoppingservice.adapters.SearchFiltersAdapter;
import com.example.shoppingservice.data.AdsItem;
import com.example.shoppingservice.data.IconTextItem;

import java.time.LocalDateTime;
import java.util.List;

public class AdsSearchFragment extends Fragment {
    RecyclerView filtersRecyclerView;
    SearchFiltersAdapter filtersAdapter;
    List<IconTextItem> filtersList;

    RecyclerView searchAdsRecyclerView;
    AdsAdapter searchAdsAdapter;
    List<AdsItem> searchAdsList;

    public AdsSearchFragment() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ads_search, container, false);
        filtersList = generateFiltersItems();
        filtersRecyclerView = rootView.findViewById(R.id.recyclerView_search_ads_filters);
        filtersAdapter = new SearchFiltersAdapter(filtersList);
        filtersRecyclerView.setAdapter(filtersAdapter);


        searchAdsList = generateSearchAdsItems();
        searchAdsRecyclerView = rootView.findViewById(R.id.recyclerView_search_ads_found);
        searchAdsAdapter = new AdsAdapter(searchAdsList);
        searchAdsRecyclerView.setAdapter(searchAdsAdapter);
        return rootView;
    }

    private List<IconTextItem> generateFiltersItems() {
        List<IconTextItem> filtersList = List.of(
                new IconTextItem(R.drawable.search_ads_filters, getString(R.string.filters)),
                new IconTextItem(R.drawable.search_ads_premium, getString(R.string.premium_ads)),
                new IconTextItem(R.drawable.search_ads_location, getString(R.string.all_ukraine)),
                new IconTextItem(R.drawable.search_ads_filters, getString(R.string.first_new))
        );
        return filtersList;
    }

    private List<AdsItem> generateSearchAdsItems() {
        List<AdsItem> adsItems = List.of(
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "TitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.rectangle, "Title", "Poltava", LocalDateTime.now(), 2500, R.drawable.ads_premium, R.drawable.ads_desired)
        );
        return adsItems;
    }
}