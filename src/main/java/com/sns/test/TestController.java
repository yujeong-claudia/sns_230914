package com.sns.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.post.mapper.PostMapper;

@Controller
public class TestController {
	
	@Autowired
	private PostMapper postMapper;
	
	//1
	@GetMapping("/test1")
	@ResponseBody
	public String test1() {
		return "Hello world..";
	}
	//2
	@GetMapping("/test2")
	@ResponseBody
	public Map<String, Object> test2() {
		Map<String, Object> result = new HashMap<>();
		result.put("도경수", "1등");
		result.put("이광수", "2등");
		result.put("김우빈", 3);
		return result;
	}
	
	//3
	@GetMapping("/test3")
	public String test3() {
		return "test/test";
	}
	
	//4
	@GetMapping("/test4")
	@ResponseBody
	public List<Map<String, Object>> test4() {
		return postMapper.selectPostList();
	}
	
}
