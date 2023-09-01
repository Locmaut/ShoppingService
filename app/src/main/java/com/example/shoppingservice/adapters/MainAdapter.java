package com.example.shoppingservice.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingservice.DesiredActivity;
import com.example.shoppingservice.R;
import com.example.shoppingservice.data.Main;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private List<Main> menuList;
    private Context context;

    public MainAdapter(Context context, List<Main> menuList) {
        this.context = context;
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_icon_text, parent, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        Main menu = menuList.get(position);
        holder.iconMenu.setImageResource(menu.getIconId());
        holder.titleMenu.setText(menu.getTitle());
        holder.tag = menu.getTag();

        holder.itemView.setOnClickListener(v -> {
            switch (holder.tag) {
                case "desired": {
                    Context context = holder.itemView.getContext();
                    Intent intent = new Intent(context, DesiredActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public class MainHolder extends RecyclerView.ViewHolder {
        ImageView iconMenu;
        TextView titleMenu;
        String tag;

        public MainHolder(@NonNull View itemView) {
            super(itemView);
            iconMenu = itemView.findViewById(R.id.imageView_icon_menu);
            titleMenu = itemView.findViewById(R.id.textView_title_menu);
        }
    }
}
