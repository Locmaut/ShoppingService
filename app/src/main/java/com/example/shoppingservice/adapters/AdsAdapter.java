package com.example.shoppingservice.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingservice.AdsPageActivity;
import com.example.shoppingservice.R;
import com.example.shoppingservice.data.AdsItem;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.AdsHolder> {


    List<AdsItem> adsItemList;

    public AdsAdapter(List<AdsItem> adsItemList) {
        this.adsItemList = adsItemList;
    }

    @NonNull
    @Override
    public AdsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ads, parent, false);
        return new AdsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsHolder holder, int position) {
        AdsItem adsItem = adsItemList.get(position);
        holder.iconAds.setImageResource(adsItem.getIconAdsId());
        holder.title.setText(adsItem.getTitle());
        holder.city.setText(adsItem.getCity());
        holder.date.setText(adsItem.getDate().format(DateTimeFormatter.ISO_DATE));
        holder.price.setText(String.valueOf(adsItem.getPrice()));
        holder.iconPremium.setImageResource(adsItem.getIconPremiumId());
        holder.iconDesired.setImageResource(adsItem.getIconDesiredId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), AdsPageActivity.class);
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return adsItemList.size();
    }

    public class AdsHolder extends RecyclerView.ViewHolder {
        private ImageView iconAds;
        private TextView title;
        private TextView city;
        private TextView date;
        private TextView price;
        private ImageView iconPremium;
        private ImageView iconDesired;
        public AdsHolder(@NonNull View itemView) {
            super(itemView);
            iconAds = itemView.findViewById(R.id.imageView_icon_ads);
            title = itemView.findViewById(R.id.textView_create_ads_title);
            city = itemView.findViewById(R.id.textView_city_ads);
            date = itemView.findViewById(R.id.textView_date_ads);
            price = itemView.findViewById(R.id.textView_price_ads);
            iconPremium = itemView.findViewById(R.id.imageView_icon_premium_ads);
            iconDesired = itemView.findViewById(R.id.imageView_desired_ads);
        }
    }
}
