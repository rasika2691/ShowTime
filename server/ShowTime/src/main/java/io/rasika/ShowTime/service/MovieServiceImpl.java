package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.rasika.ShowTime.entity.Movie;
import io.rasika.ShowTime.exception.BadRequestException;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Movie findOne(String mId) {
		// TODO Auto-generated method stub
		Movie mv = repository.findOne(mId);
		if(mv == null){
			throw new EntityNotFoundException("Movie is not available");
		}
		return mv;
	}

	@Override
	@Transactional
	public Movie create(Movie mv) {
		// TODO Auto-generated method stub
		Movie existing = repository.findByTitle(mv.getTitle());
		if(existing != null){
			throw new BadRequestException("Movie with this name already exists");
		}
		return repository.create(mv);
	}

	@Override
	@Transactional
	public Movie update(String mId, Movie mv) {
		// TODO Auto-generated method stub
		Movie existing = repository.findOne(mId);
		if (existing == null){
			throw new EntityNotFoundException("Movie not found!");
		}
				return repository.update(mv);
	}

	@Override
	@Transactional
	public void delete(String mId) {
		// TODO Auto-generated method stub
		Movie mv = repository.findOne(mId);
		if(mv == null){
			throw new EntityNotFoundException("Movie not present!");
		}
		repository.delete(mv);
	}

}
