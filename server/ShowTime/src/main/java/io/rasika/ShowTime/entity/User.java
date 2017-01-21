package io.rasika.ShowTime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
    
	@Id
	private String UserId;
	private String UserName;
	@Column(unique = true)
	private String email;
	private String CommentId;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCommentId() {
		return CommentId;
	}
	public void setCommentId(String commentId) {
		CommentId = commentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
