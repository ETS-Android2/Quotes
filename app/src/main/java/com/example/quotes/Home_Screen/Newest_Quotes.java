package com.example.quotes.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quotes.Controller.Home_Rv_Adapter;
import com.example.quotes.Controller.Newest_Rv_Adapter;
import com.example.quotes.Modal.Modal_Data_Quotes;
import com.example.quotes.Modal.Newest_Modal_Data;
import com.example.quotes.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Newest_Quotes extends AppCompatActivity {
    RecyclerView rv_newest;
    int[] images = {R.drawable.q1, R.drawable.q2, R.drawable.q3, R.drawable.q4, R.drawable.q5, R.drawable.q66, R.drawable.q7, R.drawable.q8, R.drawable.q9, R.drawable.q10, R.drawable.q11, R.drawable.q12, R.drawable.q13, R.drawable.q14, R.drawable.q151, R.drawable.q9, R.drawable.q10, R.drawable.q11, R.drawable.q12, R.drawable.q13, R.drawable.q8, R.drawable.q5, R.drawable.q9, R.drawable.q10, R.drawable.q1, R.drawable.q2, R.drawable.q3, R.drawable.q4, R.drawable.q151};
    List<Newest_Modal_Data> l3 = new ArrayList<Newest_Modal_Data>();
    ImageView back_btn;
    TextView heading_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newest_quotes);
        binding();
        Adapter();
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    void binding() {
        back_btn = findViewById(R.id.back_btn);
        rv_newest = findViewById(R.id.rv_newest);
        heading_txt = findViewById(R.id.heading_txt);
    }

    void Adapter() {
        for (int i = 0; i < images.length; i++) {
            Newest_Modal_Data newest_modal_data = new Newest_Modal_Data(images[i]);
            l3.add(newest_modal_data);
        }
        Newest_Rv_Adapter newest_rv_adapter = new Newest_Rv_Adapter(Newest_Quotes.this, l3);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        rv_newest.setLayoutManager(layoutManager);
        rv_newest.setAdapter(newest_rv_adapter);

    }
}