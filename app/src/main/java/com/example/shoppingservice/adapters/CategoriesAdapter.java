package com.example.shoppingservice.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingservice.R;
import com.example.shoppingservice.data.IconTextItem;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesHolder> {
    private List<IconTextItem> categoriesList;

    public CategoriesAdapter(List<IconTextItem> categoriesList) {

        this.categoriesList = categoriesList;
    }

    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categories, parent, false);
        return new CategoriesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder holder, int position) {
        IconTextItem item = categoriesList.get(position);
        holder.iconMenu.setImageResource(item.getIconId());
        holder.titleMenu.setText(item.getTitle());

    }


    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public class CategoriesHolder extends RecyclerView.ViewHolder {
        ImageView iconMenu;
        TextView titleMenu;

        public CategoriesHolder(@NonNull View itemView) {
            super(itemView);
            iconMenu = itemView.findViewById(R.id.imageButton_icon_categories);
            titleMenu = itemView.findViewById(R.id.textView_title_categories);
        }
    }
}
