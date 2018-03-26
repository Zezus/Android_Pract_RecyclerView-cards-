package com.example.recyclerview;

import java.util.UUID;

/**
 * Created by СадвакасовР on 26.03.2018.
 */

public class NewsItem {

    private UUID id;
    private String title;
    private String text;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
