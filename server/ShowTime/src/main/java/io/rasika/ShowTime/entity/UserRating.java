package io.rasika.ShowTime.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="UserRating.findAll", query="SELECT ur from UserRating ur ORDER BY ur.userRating desc"),
	@NamedQuery(name="UserRating.findAllUserRatingsByMovieId", query="SELECT ur from UserRating ur ORDER BY ur.userRating desc"),
	@NamedQuery(name="UserRating.findAvgUserRatingsByMovieId", query="SELECT avg(ur.userRating) from UserRating ur WHERE ur.movie.id=:pMovieId")
})
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
