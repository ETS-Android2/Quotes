package com.example.quotes.Controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.quotes.Home_Screen.Category_Homepage;
import com.example.quotes.Home_Screen.MainActivity;
import com.example.quotes.Modal.Modal_Data;
import com.example.quotes.R;

import java.util.List;

public class Home_Rv_Adapter extends RecyclerView.Adapter<Home_Rv_Adapter.ViewDataHolder> {
    Activity activity;
    List<Modal_Data> l1;


    public Home_Rv_Adapter(MainActivity mainActivity, List<Modal_Data> l1) {
        activity = mainActivity;
        this.l1 = l1;
    }

    @NonNull
    @Override
    public ViewDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_1, parent, false);

        return new ViewDataHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewDataHolder holder, int position) {
        String cat = l1.get(position).getS();
        holder.category_txt.setText(l1.get(position).getS());
        holder.quotes_images.setImageResource(l1.get(position).getImage());
        holder.quotes_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, Category_Homepage.class);
                intent.putExtra("n1", cat);
                activity.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewDataHolder extends RecyclerView.ViewHolder {
        TextView category_txt;
        ImageView quotes_images;

        public ViewDataHolder(@NonNull View itemView) {
            super(itemView);
            category_txt = itemView.findViewById(R.id.category_txt);
            quotes_images = itemView.findViewById(R.id.quotes_images);

        }
    }
}
