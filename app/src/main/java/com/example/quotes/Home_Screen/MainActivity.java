package com.example.quotes.Home_Screen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quotes.Controller.Home_Rv_Adapter;
import com.example.quotes.Modal.Modal_Data;
import com.example.quotes.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_view;
    ImageView close_btn;
    TextView new_txt_btn, random_btn;
    String[] category = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};
    int[] images = {R.drawable.m2, R.drawable.love_birds, R.drawable.sad, R.drawable.success, R.drawable.happy, R.drawable.traveller, R.drawable.friend, R.drawable.life, R.drawable.working, R.drawable.family, R.drawable.attitudde2, R.drawable.zyanm,};
    List<Modal_Data> l1 = new ArrayList<>();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
        Adapter();
        new_txt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Newest_Quotes.class);
                startActivity(intent);
            }
        });
        random_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Newest_Quotes.class);
                startActivity(intent);
            }
        });
        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert_dialog();

            }
        });


    }

    void binding() {
        rv_view = findViewById(R.id.rv_view);
        new_txt_btn = findViewById(R.id.new_txt_btn);
        random_btn = findViewById(R.id.random_btn);
        close_btn = findViewById(R.id.close_btn);
    }

    void Adapter() {
        for (int i = 0; i < category.length; i++) {
            Modal_Data modal_data = new Modal_Data(category[i], images[i]);
            l1.add(modal_data);
        }
        Home_Rv_Adapter home_rv_adapter = new Home_Rv_Adapter(MainActivity.this, l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(home_rv_adapter);

    }


    void alert_dialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.image13);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }

}