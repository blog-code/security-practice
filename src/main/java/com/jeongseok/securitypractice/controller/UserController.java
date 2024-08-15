package com.jeongseok.securitypractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@GetMapping("/loginPage")
	public String login() {
		return "/user/user";
	}

	@GetMapping("/home")
	public String home() {
		return "/home/home";
	}
}
