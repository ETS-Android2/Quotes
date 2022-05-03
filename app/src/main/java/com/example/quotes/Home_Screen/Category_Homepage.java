package com.example.quotes.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quotes.Controller.Rv_Adapter;
import com.example.quotes.Modal.Modal_Data_Quotes;
import com.example.quotes.R;

import java.util.ArrayList;
import java.util.List;

public class Category_Homepage extends AppCompatActivity {
    RecyclerView rv_category;
    String[] category = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};
    List<Modal_Data_Quotes> l2 = new ArrayList<>();
    TextView heading_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_homepage);
        binding();
        Adapter();
        String cat = getIntent().getStringExtra("n1");
        heading_txt.setText(cat);

        if (cat.equals(category[0])) {
            String[] Motivational = {"“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”", "“When you have a dream, you’ve got to grab it and never let go.”",};
            for (int i = 0; i < Motivational.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(Motivational[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[1])) {
            String[] quotes = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};

            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        }
        else if (cat.equals(category[1])) {
            String[] quotes = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};

            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        }
        else if (cat.equals(category[1])) {
            String[] quotes = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};

            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        }
        else if (cat.equals(category[1])) {
            String[] quotes = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};

            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        }
    }

    void binding() {
        rv_category = findViewById(R.id.rv_category);
        heading_txt = findViewById(R.id.heading_txt);

    }

    void Adapter() {


    }
}