package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {

}
