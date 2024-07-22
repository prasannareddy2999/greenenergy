package com.example.greenenergy.controller;

import com.example.greenenergy.entity.Article;
import com.example.greenenergy.repository.ArticleRepository;
import com.example.greenenergy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     @GetMapping("/getArticleByName/{articleTitle}")
    public List<String> getArticleByNAME(@PathVariable("articleTitle") String articleTitle)
    {
        return articleService.getArticleByName(articleTitle);
    }

    @PostMapping("/publishArticle")
    public void publishArticle(@RequestBody Article article)
    {

    }

}
