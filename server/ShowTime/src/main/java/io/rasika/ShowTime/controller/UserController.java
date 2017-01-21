package io.rasika.ShowTime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.rasika.ShowTime.entity.User;
import io.rasika.ShowTime.service.UserService;

@RestController
@RequestMapping(value= "/Users")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping (method = RequestMethod.GET)
	public List<User> findAll(){
		return service.findAll();
	}
	
	@RequestMapping (method = RequestMethod.GET,value = "/{UserId}")
	public User findOne(@PathVariable("UserId") String uId){
		return service.findOne(uId);
	}
	@RequestMapping (method = RequestMethod.POST)
	public User create(@RequestBody User ur){
		return service.create(ur);
	}
	
	@RequestMapping (method = RequestMethod.PUT,value = "/{UserId}")
	public User update(@PathVariable("UserId") String uId, @RequestBody User ur){
		return service.update(uId, ur);
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/{UserId}" )
	public void delete(@PathVariable("UserId") String uId){
		service.delete(uId);
	}
}
