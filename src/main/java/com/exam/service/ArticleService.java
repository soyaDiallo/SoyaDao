package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.Article;
import com.exam.repository.ArticleRepository;



@Service
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;
	
	public List<Article> getAllArticle(){
		return articleRepository.findAll();
	}
	
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}
	
	public Article updateArticle(Article article) {
		return articleRepository.save(article);
	}
	
	public Optional<Article> getArticleById(String id) {
		return articleRepository.findById(id);
	}
	
	public void deleteArticle(String id) {
		articleRepository.deleteById(id);
	}

}
