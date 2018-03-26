package com.example.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by СадвакасовР on 26.03.2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final Context context;
    private final List<NewsItem> news;

    public NewsAdapter(Context context, List<NewsItem> news) {

        this.context = context;
        this.news = news;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final NewsItem item = news.get(position);
        holder.titleTextView.setText(item.getTitle());
        holder.textTextView.setText(item.getText());
        holder.showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView textTextView;
        Button showButton;

        public ViewHolder(View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.i_news_title_tv);
            textTextView = itemView.findViewById(R.id.i_news_text_tv);
            showButton = itemView.findViewById(R.id.i_show_btn);

        }
    }


}
