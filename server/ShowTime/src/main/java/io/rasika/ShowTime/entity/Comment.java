package io.rasika.ShowTime.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comment {
   
	@Id
	private String CommentId;
	private String Comment;
	
	public Comment(){
		this.CommentId = UUID.randomUUID().toString();
	}
	
	public String getCommentId() {
		return CommentId;
	}
	public void setCommentId(String commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
	
	
	
	
	
}
