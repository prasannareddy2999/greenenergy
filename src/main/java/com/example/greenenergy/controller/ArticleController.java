package com.example.greenenergy.controller;

import com.example.greenenergy.repository.ArticleRepository;
import com.example.greenenergy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/getArticle/{articleId}")
    public String getArticleByID(@PathVariable("articleId") int articleId)
    {
        System.out.println("Inside Controller");
        return articleService.getArticleById(articleId);
    }

}
