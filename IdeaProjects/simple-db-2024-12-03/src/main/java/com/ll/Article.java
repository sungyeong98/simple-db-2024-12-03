package com.ll;

import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title;
    private String body;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean blind;

    public Article() {}

    public Article(long id, String title, String body, LocalDateTime createdDate, LocalDateTime modifiedDate, boolean isBlink) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createdDate = createdDate;
        this.modifiedDate = LocalDateTime.now();
        this.blind = blind;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public boolean isBlind() {
        return blind;
    }

    @Override
    public String toString() {
        return "Article{" + "id" + id + ", title" + title + ", content" + body + ", createdAt" + createdDate + '}';
    }
}

