package com.everis.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String listTeacher() {
		return "listTeacher";
	}
	
	@RequestMapping("/teacher")
	public String teacher() {
		return "teacher";
	}
}
