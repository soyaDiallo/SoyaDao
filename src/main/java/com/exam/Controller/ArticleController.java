package com.exam.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.exam.entities.Article;
import com.exam.service.ArticleService;


@RestController
public class ArticleController 
{

	@Autowired
	ArticleService articleService;
	
	@GetMapping("/articles")
	public List<Article> getAll(){
		return articleService.getAllArticle();
	}
	
	@PostMapping("/articles")
	public Article addArticle(@RequestBody Article article)
	{
		return articleService.addArticle(article);
	}
	
	@GetMapping("/articles/{id}")
	public Optional<Article> getArticle(@PathVariable String id) {
		return articleService.getArticleById(id);
	}
	
	@DeleteMapping("/articles/{id}")
	public void delete(@PathVariable String id) {
		articleService.deleteArticle(id);
	}
	
	@PutMapping("/articles/{id}")
	public ResponseEntity<Article> update(@PathVariable String id,@RequestBody Article a)
	{
		Optional<Article> article = articleService.getArticleById(id);
		if(article.isPresent())
		{
			return new ResponseEntity<> (articleService.updateArticle(a),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
