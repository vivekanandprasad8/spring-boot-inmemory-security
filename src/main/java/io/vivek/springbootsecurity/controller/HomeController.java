package io.vivek.springbootsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/user")
	public String getUser() {
		return "<h1>Hello User</h1>";
	}
	
	@RequestMapping("/admin")
	public String getAdmin() {
		return "<h1>Hello Admin</h1>";
	}
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello World";
	}

}
