package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.rasika.ShowTime.entity.Comment;
import io.rasika.ShowTime.entity.Movie;
import io.rasika.ShowTime.entity.User;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.CommentRepository;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repository;
	
	@Autowired 
	MovieService movieService;
	
	@Autowired
	UserService userService;
	
	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public Comment findOne(String id) {
		// TODO Auto-generated method stub
		Comment existing=repository.findOne(id);
		if(existing==null){
			throw new EntityNotFoundException("Comment Not Found");
			
		}
		
		return repository.findOne(id);
	}
		
	
	@Override
	public List<Comment> findAllCommentsByMovieId(String id) {
		// TODO Auto-generated method stub
		Movie existing=movieService.findOne(id);
		if(existing==null){
			throw new EntityNotFoundException("User Comments for movie Not Found");
		}
		
		return repository.findAllCommentsByMovieId(id);
				
	}
	
	@Override
	@Transactional
	public Comment create(Comment cmt) {
		// TODO Auto-generated method stub
		String movieId= cmt.getMv().getMovieId();
		String userId=cmt.getUr().getUserId();
		
		Movie movie=movieService.findOne(movieId);
		User user=userService.findOne(userId);
		
		if(movie==null){
			throw new EntityNotFoundException("Movie with id:"+movieId+" Not found");
		}
		
		if(user==null){
			throw new EntityNotFoundException("User with id:"+userId+" Not found");
		}
//		
		cmt.setMv(movie);
		cmt.setUr(user);
		return repository.create(cmt);
	}

	@Override
	public Comment update(String cmtId, Comment cmt) {
		// TODO Auto-generated method stub
		Comment existing = repository.findOne(cmtId);
		if(existing == null){
			throw new EntityNotFoundException("Comment not found");
		}
		
		String movieId= cmt.getMv().getMovieId();
		String userId=cmt.getUr().getUserId();
		
		Movie movie=movieService.findOne(movieId);
		User user=userService.findOne(userId);
		
		if(movie==null){
			throw new EntityNotFoundException("Movie with id: "+movieId+" Not found");
		}
		
		if(user==null){
			throw new EntityNotFoundException("User with id: "+userId+" Not found");
		}
		
		return repository.update(cmt);
	}

	@Override
	public void delete(String cmtId) {
		// TODO Auto-generated method stub
		Comment cmt = repository.findOne(cmtId);
		if (cmt == null){
			throw new EntityNotFoundException("Comment Not Found");
		}
		repository.delete(cmt);
	}

	

	
}
