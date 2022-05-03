package com.example.quotes.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quotes.Controller.Home_Rv_Adapter;
import com.example.quotes.Modal.Modal_Data;
import com.example.quotes.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_view;
    String[] category = {"Motivation Quotes", "Love Quotes", "Sad Quotes", "Success Quotes", "Happiness Quotes", "Travel Quotes", "Friendship Quotes", "Life Quotes", "Working Out Quotes", "Family Quotes", "Attitude Quotes", "Beauty Quotes"};
    int[] images = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,};
    List<Modal_Data> l1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
        Adapter();


    }

    void binding() {
        rv_view = findViewById(R.id.rv_view);
    }

    void Adapter() {
        for (int i = 0; i < category.length; i++) {
            Modal_Data modal_data= new Modal_Data(category[i],images[i]);
            l1.add(modal_data);
        }
        Home_Rv_Adapter home_rv_adapter = new Home_Rv_Adapter(MainActivity.this, l1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(home_rv_adapter);

    }

}