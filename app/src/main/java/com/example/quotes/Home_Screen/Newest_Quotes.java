package com.example.quotes.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quotes.R;

public class Newest_Quotes extends AppCompatActivity {

    TextView category_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newest_quotes);
        binding();
        category_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Newest_Quotes.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    void binding() {
        category_txt = findViewById(R.id.category_txt);
    }

}