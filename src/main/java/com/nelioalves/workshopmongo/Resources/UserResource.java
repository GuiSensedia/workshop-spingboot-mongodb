package com.nelioalves.workshopmongo.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.Domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>>  findAll(){
		User maria = new User("1", "Maria Silva", "silvamaria@gmail.com");
		User jose = new User("2", "Jose Santos", "santosjose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, jose));
		return ResponseEntity.ok().body(list);
	}
	
	
}
