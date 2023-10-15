package com.example.shoppingservice.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingservice.R;
import com.example.shoppingservice.data.IconTextItem;

import java.util.List;

public class SearchFiltersAdapter extends RecyclerView.Adapter<SearchFiltersAdapter.SearchFiltersHolder> {

    private List<IconTextItem> searchFiltersList;

    public SearchFiltersAdapter(List<IconTextItem> searchFiltersList) {
        this.searchFiltersList = searchFiltersList;
    }

    @NonNull
    @Override
    public SearchFiltersHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_filters, parent, false);
        return new SearchFiltersHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchFiltersHolder holder, int position) {
        IconTextItem item = searchFiltersList.get(position);
        holder.searchFilters.setText(item.getTitle());
        holder.searchFilters.setCompoundDrawablesWithIntrinsicBounds(0, 0, item.getIconId(), 0);
    }

    @Override
    public int getItemCount() {
        return searchFiltersList.size();
    }

    public class SearchFiltersHolder extends RecyclerView.ViewHolder {

        private Button searchFilters;

        public SearchFiltersHolder(@NonNull View itemView) {
            super(itemView);
            searchFilters = itemView.findViewById(R.id.button_search_filters_ads);
        }
    }
}
