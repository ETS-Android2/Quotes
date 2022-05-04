package com.example.quotes.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
    ImageView back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_homepage);
        binding();
        Adapter();
        String cat = getIntent().getStringExtra("n1");
        heading_txt.setText(cat);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        if (cat.equals(category[0])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};
            String[] Motivational = {"“When you have a dream, you’ve got to grab it and never let go.”",
                    " “Nothing is impossible. The word itself says ‘I’m possible!'”",
                    "“There is nothing impossible to they who will try.”",
                    "“The bad news is time flies. The good news is you’re the pilot.”",
                    "“Life has got all those twists and turns. You’ve got to hold on tight and off you go.”",
                    "“Keep your face always toward the sunshine, and shadows will fall behind you.”",
                    "“Success is not final, failure is not fatal: it is the courage to continue that counts.”",
                    "“You define your own life. Don’t let other people write your script.”",
                    "“You are never too old to set another goal or to dream a new dream.”",
                    "“Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.”",
                    "“You don’t always need a plan. Sometimes you just need to breathe, trust, let go and see what happens.”",
                    "“You can be everything. You can be the infinite amount of things that people are.”"};
            for (int i = 0; i < Motivational.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(Motivational[i],images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[1])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};
            String[] Love = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < Love.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(Love[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[2])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};
            String[] Sad = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < Sad.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(Sad[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[3])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};
            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[4])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[5])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[6])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[7])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[8])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[9])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[10])) {
            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
                l2.add(modal_data_quotes);
                Rv_Adapter rvAdapter = new Rv_Adapter(Category_Homepage.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_category.setLayoutManager(layoutManager);
                rv_category.setAdapter(rvAdapter);
            }
        } else if (cat.equals(category[11])) {
            int[] images = {R.drawable.background2, R.drawable.elgbackground, R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds,R.drawable.backgrounds};

            String[] quotes = {"“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.” —Angelita Lim",
                    " “You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.” —Dr. Seuss",
                    "  “Love is that condition in which the happiness of another person is essential to your own.” —Robert A. Heinlein",
                    "“The best thing to hold onto in life is each other.” –Audrey Hepburn",
                    "“I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.” —The Notebook",
                    "“If I had a flower for every time I thought of you… I could walk through my garden forever.” —Alfred Tennyson",
                    " “Take my hand, take my whole life too. For I can’t help falling in love with you.” —Elvis Presley",
                    "“If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.” –A. A. Milne",
                    " “You’re the closest to heaven, that I’ll ever be.” —Goo Goo Dolls",
                    "“You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.” —F. Scott Fitzgerald",
                    "“It’s always better when we’re together.” —Jack Johnson",
                    "“I love you and that’s the beginning and end of everything.” —F. Scott Fitzgerald"};
            for (int i = 0; i < quotes.length; i++) {
                Modal_Data_Quotes modal_data_quotes = new Modal_Data_Quotes(quotes[i], images[i]);
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
        back_btn = findViewById(R.id.back_btn);

    }

    void Adapter() {


    }
}