package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsRecyclerView;
    private ArrayList<NewsItem> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecyclerView = findViewById(R.id.ma_news_rv);

        init();

        newsRecyclerView.setAdapter(new NewsAdapter(getApplicationContext(), news));
    }

    private void init() {
        NewsItem item1 = new NewsItem();
        item1.setId(UUID.randomUUID());
        item1.setTitle("1Zezus team ");
        item1.setText("1It is a long established fact that a reader will versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");


        NewsItem item2 = new NewsItem();
        item2.setId(UUID.randomUUID());
        item2.setTitle("2Zezus team ");
        item2.setText("2It is a long established fact that a reader will versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");


        NewsItem item3 = new NewsItem();
        item3.setId(UUID.randomUUID());
        item3.setTitle("3Zezus team ");
        item3.setText("3It is a long established fact that a reader will versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");


        NewsItem item4 = new NewsItem();
        item4.setId(UUID.randomUUID());
        item4.setTitle("4Zezus team ");
        item4.setText("4It is a long established fact that a reader will versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");

        news = new ArrayList<>();
        news.add(item1);
        news.add(item2);
        news.add(item3);
        news.add(item4);
    }


}
