package com.example.quotes.Controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.quotes.Home_Screen.Category_Homepage;
import com.example.quotes.Modal.Modal_Data_Quotes;
import com.example.quotes.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rv_Adapter extends RecyclerView.Adapter<Rv_Adapter.ViewDataHolder> {
    Activity activity;
    List<Modal_Data_Quotes> l2 = new ArrayList<>();

    public int i = 0;

    public Rv_Adapter(Category_Homepage category_homepage, List<Modal_Data_Quotes> l2) {
        activity = category_homepage;
        this.l2 = l2;
    }

    @NonNull
    @Override
    public ViewDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_2, parent, false);

        return new ViewDataHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewDataHolder holder, int position) {
        final Random RANDOM = new Random();
        holder.slogan_txt.setText(l2.get(position).getS());


        holder.change_images_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i < 12) {
                    holder.change_images_btn.setImageResource(l2.get(i).getImages());

                    i++;

                    if (i >= 12) {
                        i = 0;
                    }

                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return l2.size();
    }

    class ViewDataHolder extends RecyclerView.ViewHolder {
        TextView slogan_txt;
        LinearLayout copy_btn;
        ImageView change_images_btn;

        public ViewDataHolder(@NonNull View itemView) {
            super(itemView);
            slogan_txt = itemView.findViewById(R.id.slogan_txt);
            copy_btn = itemView.findViewById(R.id.copy_btn);
            change_images_btn = itemView.findViewById(R.id.change_images_btn);

        }

    }


}
