package io.rasika.ShowTime.entity;

import javax.persistence.Entity;

@Entity
public class Comment {

	private String CommentId;
	private String MovieId;
	private String Comments;
	private String UserId;
	
	public String getCommentId() {
		return CommentId;
	}
	public void setCommentId(String commentId) {
		CommentId = commentId;
	}
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	
	
	
	
}
