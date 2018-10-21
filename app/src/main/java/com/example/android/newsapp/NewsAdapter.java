package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    //Constructor of a new NewsAdapter
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView title = listItemView.findViewById(R.id.article_title);
        title.setText(currentNews.getArticleTitle());

        TextView section = listItemView.findViewById(R.id.article_section);
        section.setText(currentNews.getArticleSection());

        String originalDate = currentNews.getArticleDate();
        String substringDate = originalDate.substring(0,16);
        String dateFormatted = substringDate.replace("-", "/");
        dateFormatted = dateFormatted.replace("T"," ");

        TextView date = listItemView.findViewById(R.id.article_date);
        date.setText(dateFormatted);

        return listItemView;
    }
}
