package io.rasika.ShowTime.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserRating {
	
	@Id
	private String RatingId;
	private String MovieId;
	private int Rating;
	
	@OneToOne
	private Movie mv;
	
	@OneToOne
	private User ur;
	
	public String getRatingId() {
		return RatingId;
	}
	public void setRatingId(String ratingId) {
		RatingId = ratingId;
	}
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
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
	

	
}
