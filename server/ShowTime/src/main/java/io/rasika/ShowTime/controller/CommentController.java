package io.rasika.ShowTime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.rasika.ShowTime.entity.Comment;
import io.rasika.ShowTime.service.CommentService;

@RestController
@RequestMapping(value= "/Comments")
public class CommentController {

	@Autowired
	private CommentService service;
	
	@RequestMapping (method = RequestMethod.GET)
	public List<Comment> findAll(){
		return service.findAll();
	}
	
	
	@RequestMapping (method = RequestMethod.POST)
	public Comment create(@RequestBody Comment cmt){
		return service.create(cmt);
	}
	
	@RequestMapping (method = RequestMethod.PUT,value = "/{CommentId}")
	public Comment update(@PathVariable("CommentId") String cmtId, @RequestBody Comment cmt){
		return service.update(cmtId, cmt);
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/{CommentId}" )
	public void delete(@PathVariable("CommentId") String cmtId){
		service.delete(cmtId);
	}
}
