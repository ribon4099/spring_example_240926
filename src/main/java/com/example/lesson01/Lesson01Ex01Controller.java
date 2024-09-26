package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring 관리 bean으로 등록

public class Lesson01Ex01Controller {

		// http://localhost:8080/lesson01/ex01/1
		// String을 브라우저에 출력
		@RequestMapping("/lesson01/ex01/1")
		@ResponseBody
		public String ex01_1() {
			return "<h2>Hello world</h2>";
		}
		
		
		// http://localhost:8080/lesson01/ex01/2
		// Map 리턴 => JSON String
		@RequestMapping("/lesson01/ex01/2")
		@ResponseBody
		public Map<String, Object> ex01_2() {
			Map<String, Object> map = new HashMap<>();
			map.put("사과", 30);
			map.put("라즈베리", 30);
			map.put("망고", 30);
			map.put("체리", 30);
			
			// jackson 라이브러리
			return map;   // { "사과"=30....}
		}
	
}
