package com.spring.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

// Anotação que mostra ao spring que esta classe é um bean gerenciado por ele
@Service
//Classe que contém métodos gerados pela Inteface 'CodeblogService'
public class CodeblogServiceImpl implements CodeblogService{

	@Autowired
	CodeblogRepository codeblogRepository;
	
	// Método que retorna uma lista de posts
	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	// Método que retorna um post através do Id
	@Override
	public Post findById(long id) {
		return codeblogRepository.findById(id).get();
	}

	// Método que salva um post no banco de dados
	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
