package com.example.shoppingservice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingservice.R;
import com.example.shoppingservice.data.Ads;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.AdsHolder> {

    Context context;
    List<Ads> adsList;

    public AdsAdapter(Context context, List<Ads> adsList) {
        this.context = context;
        this.adsList = adsList;
    }

    @NonNull
    @Override
    public AdsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ads, parent, false);
        return new AdsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsHolder holder, int position) {
        Ads ads = adsList.get(position);
        holder.iconAds.setImageResource(ads.getIconAdsId());
        holder.title.setText(ads.getTitle());
        holder.city.setText(ads.getCity());
        holder.date.setText(ads.getDate().format(DateTimeFormatter.ISO_DATE));
        holder.price.setText(String.valueOf(ads.getPrice()));
        holder.iconPremium.setImageResource(ads.getIconPremiumId());
        holder.iconDesired.setImageResource(ads.getIconDesiredId());

    }

    @Override
    public int getItemCount() {
        return adsList.size();
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
            title = itemView.findViewById(R.id.textView_title_ads);
            city = itemView.findViewById(R.id.textView_city_ads);
            date = itemView.findViewById(R.id.textView_date_ads);
            price = itemView.findViewById(R.id.textView_price_ads);
            iconPremium = itemView.findViewById(R.id.imageView_premium_ads);
            iconDesired = itemView.findViewById(R.id.imageView_desired_ads);
        }
    }
}
