package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Lesson01Ex02Controller {

	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		//return되는 String은 HTML의 경로
		//@ResponseBody가 없어야 한다.
		
		return "lesson01/ex02";  // html 경로이다. 
	}
}
