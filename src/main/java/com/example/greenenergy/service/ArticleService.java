package com.example.greenenergy.service;

import com.example.greenenergy.entity.Article;
import com.example.greenenergy.entity.Content;
import com.example.greenenergy.repository.ArticleRepository;
import com.example.greenenergy.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    public ArticleRepository articleRepository;

    @Autowired
    public ContentRepository contentRepository;

    public String getArticleById(int id)
    {
       Optional<Article> articleOptional = Optional.of(articleRepository.getReferenceById(id));
        if(articleOptional.isPresent())
        {
            Content content=articleOptional.get().articleContent;
            if(content!=null)
            {
        return(content.getArticleContent());}
        }
        System.out.println("Article with that id isn't available");
            return "Article isn't available";

    }

}
