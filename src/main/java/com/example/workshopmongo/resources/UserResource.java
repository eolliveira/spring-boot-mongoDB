package com.example.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User(1L, "Erick Oliveira", "erick@gmail.com");
		User u2 = new User(2L, "Maria Silva", "maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		return ResponseEntity.ok().body(list);
	}
}
