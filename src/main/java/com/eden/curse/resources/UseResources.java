package com.eden.curse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.curse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "eden", "eden@gmail.com", "11970750048", "edenf");
		return ResponseEntity.ok().body(u);
	}
	
}
