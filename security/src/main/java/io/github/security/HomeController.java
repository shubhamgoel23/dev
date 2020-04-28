package io.github.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greetings() {
		return "<h1>welcome</h1>";
	}
	
	@GetMapping("/admin")
	public String greetingsAdmin() {
		return "<h1>welcome Admin</h1>";
	}
	
	@GetMapping("/user")
	public String greetingsUser() {
		return "<h1>welcome User</h1>";
	}

}
