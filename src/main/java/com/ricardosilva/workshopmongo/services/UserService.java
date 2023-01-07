package com.ricardosilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardosilva.workshopmongo.domain.User;
import com.ricardosilva.workshopmongo.repository.UserRepository;
import com.ricardosilva.workshopmongo.services.exception.ObjectNotfoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotfoundException("Objeto Não encontrado"));
	}
}
