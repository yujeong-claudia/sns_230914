package com.sns.post;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sns.post.bo.PostBO;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/post")
@RestController
public class PostRestController {

	@Autowired
	private PostBO postBO;

	@PostMapping("/create")
	public Map<String, Object> create(@RequestParam("imagePath") String imagePath,
			@RequestParam(value = "file", required = false) MultipartFile file, HttpSession session) {

		// 글쓴이 번호 - session에 있는 userId를 꺼낸다.
		int userId = (int) session.getAttribute("userId");
		// null이면 에러가 나게 설정~_~
		String userLoginId = (String) session.getAttribute("userLoginId");

		// DB Insert
		postBO.addPost(userId, userLoginId, imagePath, file);

		// 응답값
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		return result;
	}
}
