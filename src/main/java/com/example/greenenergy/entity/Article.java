package com.example.greenenergy.entity;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long articleId;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "content_id", referencedColumnName = "contentId")
    public Content articleContent;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
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
