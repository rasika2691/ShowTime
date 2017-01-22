package io.rasika.ShowTime.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class UserRating {
	
	private String Rating_id;
	private String Movie_Id;
	private String Rating;
	//private String UserId;
	
	public String getRating_id() {
		return Rating_id;
	}
	public void setRating_id(String rating_id) {
		Rating_id = rating_id;
	}
	public String getMovie_Id() {
		return Movie_Id;
	}
	public void setMovie_Id(String movie_Id) {
		Movie_Id = movie_Id;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
//	public String getUserId() {
//		return UserId;
//	}
//	public void setUserId(String userId) {
//		UserId = userId;
//	}
	
}
