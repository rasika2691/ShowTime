package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.Comment;

@Service
public interface CommentService {

	public List<Comment> findAll();
	public Comment create(Comment cmt);
	public Comment update(String cmtId,  Comment cmt);
	public void delete(String cmtId);
}
