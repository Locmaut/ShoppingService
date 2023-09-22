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
import com.example.shoppingservice.data.CategoriesItem;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MainHolder> {
    private List<CategoriesItem> menuList;

    public CategoriesAdapter(List<CategoriesItem> menuList) {

        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categories, parent, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        CategoriesItem menu = menuList.get(position);
        holder.iconMenu.setImageResource(menu.getIconId());
        holder.titleMenu.setText(menu.getTitle());


    }


    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public class MainHolder extends RecyclerView.ViewHolder {
        ImageView iconMenu;
        TextView titleMenu;

        public MainHolder(@NonNull View itemView) {
            super(itemView);
            iconMenu = itemView.findViewById(R.id.imageButton_icon_menu);
            titleMenu = itemView.findViewById(R.id.textView_title_menu);
        }
    }
}
