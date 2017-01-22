package io.rasika.ShowTime.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TvSeries {

	@Id
	private String TvSeriesId;
	@Column(unique = true)
	private String title;
	private Date releaseYear;
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
	private String imdbRating;
	private String imdbVotes;
	private String imdbId;
	private String type;
	
	public TvSeries(){
		this.TvSeriesId = UUID.randomUUID().toString();
	}
	
	public String getTvSeriesId() {
		return TvSeriesId;
	}
	public void setTvSeriesId(String tvSeriesId) {
		TvSeriesId = tvSeriesId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
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
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
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
