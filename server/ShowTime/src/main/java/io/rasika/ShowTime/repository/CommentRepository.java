package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.Comment;
@Repository
public interface CommentRepository {

	public List<Comment> findAll();
	public Comment findOne(String cmtId);
	public List<Comment> findAllCommentsByMovieId(String id);
	public Comment create(Comment cmt);
	public Comment update(Comment cmt);
	public void delete(Comment cmt);
}
