package com.example.quotes.Controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes.Home_Screen.Newest_Quotes;
import com.example.quotes.Modal.Modal_Data_Quotes;
import com.example.quotes.Modal.Newest_Modal_Data;
import com.example.quotes.R;

import java.util.ArrayList;
import java.util.List;

public class Newest_Rv_Adapter extends RecyclerView.Adapter<Newest_Rv_Adapter.ViewDataHolder> {
    Activity activity;
    List<Newest_Modal_Data> l4 = new ArrayList<>();

    public Newest_Rv_Adapter(Newest_Quotes newest_quotes, List<Newest_Modal_Data> l3) {
        activity = newest_quotes;
        l4 = l3;
    }

    @NonNull
    @Override
    public ViewDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_3, parent, false);

        return new Newest_Rv_Adapter.ViewDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewDataHolder holder, int position) {
        holder.quotes_images.setImageResource(l4.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return l4.size();
    }

    public class ViewDataHolder extends RecyclerView.ViewHolder {
        ImageView quotes_images;

        public ViewDataHolder(@NonNull View itemView) {

            super(itemView);

            quotes_images = itemView.findViewById(R.id.quotes_images);
        }
    }
}
