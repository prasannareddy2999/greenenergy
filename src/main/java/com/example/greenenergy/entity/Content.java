package com.example.greenenergy.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Content {
    @Id
    int contentId;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    String articleContent;

    @Override
    public String toString() {
        return "Content{" +
                "contentId=" + contentId +
                ", Content='" + articleContent + '\'' +
                '}';
    }
}
