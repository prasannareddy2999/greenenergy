package com.example.greenenergy.service;

import com.example.greenenergy.entity.Article;
import com.example.greenenergy.entity.Content;
import com.example.greenenergy.repository.ArticleRepository;
import com.example.greenenergy.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    public ArticleRepository articleRepository;

    @Autowired
    public ContentRepository contentRepository;

    public String getArticleById(int id)
    {
        Article article=articleRepository.getReferenceById(id);
        if(article!=null)
        {
            Content content=article.articleContent;
            if(content!=null)
            {
        return(content.getArticleContent());}
        }
        System.out.println("Article with that id isn't available");
            return "Article isn't available";

    }

}
