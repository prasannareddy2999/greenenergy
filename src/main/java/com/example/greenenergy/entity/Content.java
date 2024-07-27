package com.example.greenenergy.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Content {
    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long contentId;

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
