package com.sns.post.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sns.post.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {

	public List<PostEntity> findAllByOrderByIdDesc();
}