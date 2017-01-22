package io.rasika.ShowTime.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Comment.findAll", query="SELECT cmt from Comment cmt"),
	@NamedQuery(name="Comment.findAllUserCommentsByMovieId", query="SELECT cmt from Comment cmt")
})
public class Comment {
   
	@Id
	private String CommentId;
	private String Comment;
	
	@ManyToOne
	private Movie mv;  //Many Comments to one movie
	
	@ManyToOne
	private User ur;  // Many Comments to one user
	
	public Comment(){
		this.CommentId = UUID.randomUUID().toString();
	}
	
	public String getCommentId() {
		return CommentId;
	}
	public Movie getMv() {
		return mv;
	}

	public void setMv(Movie mv) {
		this.mv = mv;
	}

	public User getUr() {
		return ur;
	}

	public void setUr(User ur) {
		this.ur = ur;
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

	@Override
	public String toString() {
		return "Comment [CommentId=" + CommentId + ", Comment=" + Comment + ", mv=" + mv + ", ur=" + ur + "]";
	}
	
	
	
	
	
}
