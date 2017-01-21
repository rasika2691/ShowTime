package io.rasika.ShowTime.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.rasika.ShowTime.entity.*;
import io.rasika.ShowTime.service.MovieService;

@RestController
@RequestMapping(value= "/movies")
public class MovieController {

	@Autowired
	private MovieService service;
	
	//CRUD operation
	
	@RequestMapping (method = RequestMethod.GET)
	public List<Movie> findAll(){
		return service.findAll();
	}
	
	@RequestMapping (method = RequestMethod.GET,value = "/{MovieId}")
	public Movie findOne(@PathVariable("MovieId") String mId){
		return service.findOne(mId);
	}
	
	@RequestMapping (method = RequestMethod.POST)
	public Movie create(@RequestBody Movie mv){
		return service.create(mv);
	}
	
	@RequestMapping (method = RequestMethod.PUT,value = "/{MovieId}")
	public Movie update(@PathVariable("MovieId") String mId, @RequestBody Movie mv){
		return service.update(mId, mv);
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/{MovieId}" )
	public void delete(@PathVariable("MovieId") String mId){
		service.delete(mId);
	}
	
	//Search operation
	
	@RequestMapping(method=RequestMethod.GET, path="findbytype/{type}")
	public List<Movie> findByType(@PathVariable("type") String type){
		return service.findByType(type);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="findbyyear/{year}")
	public List<Movie> findByYear(@PathVariable("year") int year){
		return service.findByYear(year);
		}
	
	@RequestMapping(method=RequestMethod.GET, path="findbygenre/{genre}")
	public List<Movie> findByGenre(@PathVariable("genre") String genre){
		return service.findByGenre(genre);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="findbytitle/{title}")
	public Movie findByTitle(@PathVariable("title") String title){
		return service.findByTitle(title);
	
	}
	
	// Sort Operations
	
	@RequestMapping(method=RequestMethod.GET, path="sortbyimdbratings")
	public List<Movie> sortByImdbRating(){
		return service.sortByImdbRatings();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="sortbyyears")	
	public List<Movie> sortByYear(){
		return service.sortByYear();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="sortbyimdbvotes")
	public List<Movie> sortByImdbVote(){
		return service.sortByImdbVotes();
	}
 	
	@RequestMapping(method=RequestMethod.GET, path="topmovies")
	public List<Movie> topRatedMovies(){
		return service.topRatedMovies();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="topseries")
	public List<Movie> topRatedSeries(){
		return service.topRatedSeries();
	}
}
