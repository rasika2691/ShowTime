package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.TvSeries;
import io.rasika.ShowTime.exception.BadRequestException;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.TvSeriesRepository;
@Service
public class TvSeriesServiceImpl implements TvSeriesService {

	@Autowired
	public TvSeriesRepository repository;
	
	@Override
	public List<TvSeries> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public TvSeries findOne(String TvId) {
		// TODO Auto-generated method stub
		TvSeries tv = repository.findOne(TvId);
		if(tv == null){
			throw new EntityNotFoundException("TvSeries not found");
		}
		return tv;
	}

	@Override
	public TvSeries create(TvSeries tv) {
		// TODO Auto-generated method stub
		TvSeries existing = repository.findByTitle(tv.getTitle());
		if(existing == null){
			throw new BadRequestException("Tv Series Already exists");
		}
		return repository.create(tv);
	}

	@Override
	public TvSeries update(String TvId, TvSeries tv) {
		// TODO Auto-generated method stub
		TvSeries existing = repository.findOne(TvId);
		if(existing == null){
			throw new EntityNotFoundException("TvSeries Not found");
		}
		return repository.update(TvId, tv);
	}

	@Override
	public void delete(String TvId) {
		// TODO Auto-generated method stub
		
		TvSeries tv = repository.findOne(TvId);
		if(tv == null){
			throw new EntityNotFoundException("TvSeries Not found");
		}
		repository.delete(TvId);
	}

}
