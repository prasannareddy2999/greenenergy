package com.example.greenenergy.service;

import com.example.greenenergy.entity.Article;
import com.example.greenenergy.entity.Content;
import com.example.greenenergy.dao.ArticleRepository;
import com.example.greenenergy.dao.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    public ArticleRepository articleRepository;

    @Autowired
    public ContentRepository contentRepository;

    public String getArticleById(Long id)
    {
       Optional<Article> articleOptional = articleRepository.findById(id);
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

    public List<String> getArticleByName(String name)
    {
        List<String> articles=new ArrayList<String>();
        List<Article> articlelist=articleRepository.findByArticleTitle(name);
                if (articlelist.size()>0)
                {
                    for (Article article : articlelist)
                    {
                        Optional<Content> optionalContent=Optional.of(article.articleContent);
                        if(optionalContent.isPresent())
                        {
                            articles.add(optionalContent.get().getArticleContent());
                        }
                    }

                }

                return articles;
            }




    public void createArticle(Article article)
    {
        Content content=article.articleContent;
        contentRepository.save(content);
        article.setArticleContent(content);
        articleRepository.save(article);
    }

    public void updateArticle(String articletitle,Article updatedarticle)
    {
        List<Article> articles=articleRepository.findByArticleTitle(articletitle);
        if(articles.size()>0)
        {
            for(Article article:articles)
            {
               article.setArticleTitle(updatedarticle.articleTitle);
                article.setArticleCategory(updatedarticle.articleCategory);
                article.setArticleContent(updatedarticle.articleContent);
                if(article.articleContent!=null)
                {
                    contentRepository.save(article.articleContent);
                }
                 articleRepository.save(article);
            }

        }
    }

    public void deleteArticle(String articleTitle)
    {
        List<Article> articles=articleRepository.findByArticleTitle(articleTitle);
        if(articles.size()>0)
        {
            for(Article article:articles)
            {
                contentRepository.delete(article.articleContent);
                articleRepository.delete(article);
            }
        }


    }

}
