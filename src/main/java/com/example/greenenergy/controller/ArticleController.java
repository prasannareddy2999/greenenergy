package com.example.greenenergy.controller;

import com.example.greenenergy.entity.Article;
import com.example.greenenergy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/getArticle/{articleId}")
    public String getArticleByID(@PathVariable("articleId") Long articleId)
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
        articleService.createArticle(article);
    }

    @PutMapping("/updatearticle/{ArticleTitle}")
    public void updateArticleByTitle(@PathVariable("ArticleTitle") String articleTitle , @RequestBody Article updatedarticle)
    {
        articleService.updateArticle(articleTitle,updatedarticle);
    }
    @DeleteMapping("/deletearticle/{articleTitle}")
    public void deleteArticlebyTitle(@PathVariable("articleTitle") String articleTitle)
    {
        articleService.deleteArticle(articleTitle);
    }

}
