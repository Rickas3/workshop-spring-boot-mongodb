package com.ricardosilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardosilva.workshopmongo.domain.Post;
import com.ricardosilva.workshopmongo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		//return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		return obj.orElseThrow();
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}

}
