package com.codeit.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String index()
{
		return "index.html";
		}
	@GetMapping("/login")
	public String login()
{
		return "login.html";
		}
}


