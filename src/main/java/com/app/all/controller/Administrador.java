package com.app.all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class Administrador {

	@RequestMapping("")
	public String index() {
		return "administrador/index";
	}
}
