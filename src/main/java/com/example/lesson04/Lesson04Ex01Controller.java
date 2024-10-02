package com.example.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/lesson04/ex01")
@Controller  // HTML 경로일 때는 @ResponseBody가 없다
public class Lesson04Ex01Controller {
	
	// 회원가입 화면
	// http://localhost/lesson04/ex01/add-user-view
	@RequestMapping(path = "/add-user-view", method = RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser"; //HTML의 경로
	}
	
	// 회원가입 데이터 DB insert => 결과 화면 이동
	@PostMapping("/add-user")  
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		// DB insert
		
		// 결과 화면 이동
		return "lesson04/afterAddUser";
	}
	

}