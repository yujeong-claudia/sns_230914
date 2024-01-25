package com.sns.post.bo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sns.common.FileManagerService;
import com.sns.post.entity.PostEntity;
import com.sns.post.mapper.PostMapper;
import com.sns.post.repostiory.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PostBO {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private FileManagerService fileManagerService;
	
	// input: X   output: List<PostEntity>
	public List<PostEntity> getPostList() {
		return postRepository.findAllByOrderByIdDesc();
	}
	
	// input: 파라미터들   output:PostEntity
		public PostEntity addPost(int userId, String userLoginId, 
				String content, MultipartFile file) {
			
			String imagePath = null;

			// 이미지가 있으면 업로드 후 imagePath를 받아옴
			if (file != null) {
				imagePath = fileManagerService.saveFile(userLoginId, file);
			}

			return postRepository.save(PostEntity.builder()
					.userId(userId)
					.content(content)
					.imagePath(imagePath)
					.build());
		}
		
		// input: postId, userId	output:x
		public void deletePostByPostIdUserId(int postId, int userId) {
			
			// 기존 글 가져오기
			List<PostEntity> post = postRepository.findAllByOrderByIdDesc();
			
			// 글 삭제
			postRepository.delete(post);
			
			// 이미지 있으면 삭제
			fileManagerService.deleteFile(post.getImagePath());
			
			// 댓글들 삭제
			fileManagerService.deleteFile(comment.content());
			
			// 좋아요들 삭제
			fileManagerService.deleteFile(like.postId());
		}
	
}