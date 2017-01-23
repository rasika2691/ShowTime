package io.rasika.ShowTime.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table
@NamedQueries({
	@NamedQuery(name="User.findAll",query="SELECT u FROM User u"),
	@NamedQuery(name= "User.findByEmail",query ="SELECT u FROM User u WHERE u.email =:pEmail")
})
public class User {
    
	@Id
	private String UserId;
	private String UserName;
	@Column(unique = true)
	private String email;
	private String CommentId;
	private String password;
	
	public User(){
		this.UserId = UUID.randomUUID().toString();
	}
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
