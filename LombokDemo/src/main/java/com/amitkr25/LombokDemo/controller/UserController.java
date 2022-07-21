package com.amitkr25.LombokDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amitkr25.LombokDemo.model.*;

@RestController
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@GetMapping("/user")
	public List<User> findAllUser() {
//		List<User> users = new ArrayList<User>();
		users.add(new User("Amit", "Surat"));	
		return users;
	}
	
	@GetMapping("/users")
	public List<User> findAllUser2() {
		return users;
	}
	
	@PostMapping(
			value="/postbody",
			consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	)
	public ResponseEntity<User> postBody(@RequestBody @Validated User user) {
		users.add(user);
		return ResponseEntity.ok().body(user);
	}
}
