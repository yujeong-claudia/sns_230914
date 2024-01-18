package com.sns.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sns.post.entity.PostEntity;
import com.sns.post.mapper.PostMapper;
import com.sns.post.repostiory.PostRepository;

@Service
public class PostBO {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private PostMapper postMapper;
	
	// input: X   output: List<PostEntity>
	public List<PostEntity> getPostList() {
		return postRepository.findAllByOrderByIdDesc();
	}
	
	//input:params		output: x
	public void addPost(int userId, String content, String imagePath, MultipartFile file) {
		
		postMapper.insertPost(userId, content, imagePath);
	}
	
}