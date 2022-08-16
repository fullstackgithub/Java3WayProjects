package com.garagem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/") //Mapeamento da URL: http://localhost:8080/
	public String home() {
		return "index";
	}

}
