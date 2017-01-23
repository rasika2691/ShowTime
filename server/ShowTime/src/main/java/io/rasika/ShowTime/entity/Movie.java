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
@NamedQuery(name="Movie.findAll", query="SELECT m FROM Movie m ORDER BY title ASC"), 
@NamedQuery(name="Movie.findByTitle",query= "SELECT m fROM Movie m WHERE m.title=:pTitle" ),
@NamedQuery(name="Movie.findByType", query="SELECT m from Movie m WHERE m.type=:pType"),
@NamedQuery(name="Movie.findByYear", query="SELECT m from Movie m WHERE m.year=:pYear"),
@NamedQuery(name="Movie.findByGenre", query="SELECT m from Movie m WHERE m.genre=:pGenre"),
@NamedQuery(name="Movie.sortByImdbRatings", query="SELECT m from Movie m ORDER BY imdbRating DESC"),
@NamedQuery(name="Movie.sortByYear", query="SELECT m from Movie m ORDER BY year DESC"),
@NamedQuery(name="Movie.sortByImdbVotes", query="SELECT m from Movie m ORDER BY imdbVotes DESC"),
@NamedQuery(name="Movie.topRatedMovies", query="SELECT m from Movie m WHERE m.type=:pType AND m.imdbRating > :pLimit ORDER BY imdbRating DESC"),
@NamedQuery(name="Movie.topRatedSeries", query="SELECT m from Movie m WHERE m.type=:pType AND m.imdbRating > :pLimit ORDER BY imdbRating DESC")

})
public class Movie {

	@Id
	private String MovieId;
	@Column(unique = true)
	private String title;
	private int year;
	private String rated;
	private String time;
	private String genere;
	private String director;
	private String writer;
	private String actor;
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private String metaScore;
	private double imdbRating;
	private long imdbVotes;
	private String imdbId;
	private String type;
	
	public Movie(){
		this.MovieId = UUID.randomUUID().toString();
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String movieId) {
		MovieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMetaScore() {
		return metaScore;
	}
	public void setMetaScore(String metaScore) {
		this.metaScore = metaScore;
	}
	
	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public long getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(long imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
