package com.example.shoppingservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingservice.adapters.AdsAdapter;
import com.example.shoppingservice.adapters.CategoriesAdapter;
import com.example.shoppingservice.data.AdsItem;
import com.example.shoppingservice.data.IconTextItem;

import java.time.LocalDateTime;
import java.util.List;


public class HomeFragment extends Fragment {
    RecyclerView categoriesRecyclerView;
    CategoriesAdapter categoriesAdapter;
    List<IconTextItem> categoriesList;

    RecyclerView adsRecyclerView;
    AdsAdapter adsAdapter;
    List<AdsItem> adsList;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        categoriesList = generateCategoriesItems();
        categoriesRecyclerView = rootView.findViewById(R.id.recyclerView_home_categories);
        categoriesAdapter = new CategoriesAdapter(categoriesList);
        categoriesRecyclerView.setAdapter(categoriesAdapter);

        adsList = generateAdsItems();
        adsRecyclerView = rootView.findViewById(R.id.recyclerView_home_premium_ads);
        adsAdapter = new AdsAdapter(adsList);
        adsRecyclerView.setAdapter(adsAdapter);
        return rootView;
    }

    private List<IconTextItem> generateCategoriesItems() {
        List<IconTextItem> categoriesList = List.of(
                new IconTextItem(R.drawable.btn_business_and_services, getString(R.string.business_and_services)),
                new IconTextItem(R.drawable.btn_free, getString(R.string.free)),
                new IconTextItem(R.drawable.btn_children_world, getString(R.string.children_world)),
                new IconTextItem(R.drawable.btn_home_and_garden, getString(R.string.home_and_garden)),
                new IconTextItem(R.drawable.btn_help, getString(R.string.help)),
                new IconTextItem(R.drawable.btn_electronic, getString(R.string.electronic)),
                new IconTextItem(R.drawable.btn_beauty_and_health, getString(R.string.beauty_and_health)),
                new IconTextItem(R.drawable.btn_fashion_and_style, getString(R.string.fashion_and_style)),
                new IconTextItem(R.drawable.btn_real_estate, getString(R.string.real_estate)),
                new IconTextItem(R.drawable.btn_work, getString(R.string.work)),
                new IconTextItem(R.drawable.btn_animal, getString(R.string.animal)),
                new IconTextItem(R.drawable.btn_transport, getString(R.string.transport)),
                new IconTextItem(R.drawable.btn_hobby, getString(R.string.hobby))
        );
        return categoriesList;
    }

    private List<AdsItem> generateAdsItems() {
        List<AdsItem> adsItems = List.of(
                new AdsItem(R.drawable.one, "iPhone 15 Pro Max 512gb", "Lviv", LocalDateTime.now(), 51000, R.drawable.ads_premium, R.drawable.ads_desired_red),
                new AdsItem(R.drawable.image, "Ноутбук Acer Nitro 5 AN515-57-56P7", "Poltava", LocalDateTime.now(), 15500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.image1, "Ноутбук Lenovo", "Kyiv", LocalDateTime.now(), 22500, R.drawable.ads_premium, R.drawable.ads_desired),
                new AdsItem(R.drawable.image2, "Планшет Lenovo Yoga Tab", "Poltava", LocalDateTime.now(), 6000, R.drawable.ads_premium, R.drawable.ads_desired),
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
