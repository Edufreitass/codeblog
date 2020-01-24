package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

// Interface que terá alguns métodos definidos
public interface CodeblogService {

	// Retorna uma lista de posts
	List<Post> findAll();
	// Retorna um único post
	Post findById(long id);
	// Recebe um post para salvar no banco de dados
	Post save(Post post);
}
