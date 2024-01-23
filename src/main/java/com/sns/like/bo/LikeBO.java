package com.sns.like.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.like.mapper.LikeMapper;


@Service
public class LikeBO {
	
	@Autowired
	private LikeMapper likeMapper;
	
	// 추가 c~r~u~d~
	// input: postId, userId	output: x
	public void likeToggle(int postId, int userId) {
		if(likeMapper.selectLikeCountByPostIdUserId(postId, userId) > 0) {
			// 있으면 삭제
			likeMapper.deleteLikeByPostIdUserId(postId, userId);
		} else { // like가 없으면 추가
			likeMapper.insertLike(postId, userId);
		}
		
	}
	
	public int getLikeCountByPostId(int postId) {
		return likeMapper.
	}
}
