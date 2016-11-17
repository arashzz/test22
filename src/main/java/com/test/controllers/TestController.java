package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/{vara}/{varb}")
	public String index(@PathVariable(value="vara") String vara, @PathVariable(value="varb") String varb) {
		return"/index.html";
	}
}
