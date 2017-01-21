package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.rasika.ShowTime.entity.Comment;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.CommentRepository;

public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repository;
	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Comment create(Comment cmt) {
		// TODO Auto-generated method stub
		return repository.create(cmt);
	}

	@Override
	public Comment update(String cmtId, Comment cmt) {
		// TODO Auto-generated method stub
		Comment existing = repository.findOne(cmtId);
		if(existing == null){
			throw new EntityNotFoundException("Comment not found");
		}
		return repository.update(cmtId, cmt);
	}

	@Override
	public void delete(String cmtId) {
		// TODO Auto-generated method stub
		Comment cmt = repository.findOne(cmtId);
		if (cmt == null){
			throw new EntityNotFoundException("Comment Not Found");
		}
		repository.delete(cmtId);
	}

}
