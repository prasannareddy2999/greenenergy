package com.example.greenenergy.entity;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int articleId;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String articleTitle;


    public Content getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(Content articleContent) {
        this.articleContent = articleContent;
    }

    @OneToOne
    public Content articleContent;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String articleCategory;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent=" + articleContent +
                ", articleCategory='" + articleCategory + '\'' +
                '}';
    }
}
