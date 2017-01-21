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
	
	
}
