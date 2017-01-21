package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.TvSeries;

@Service
public interface TvSeriesService {

	public List<TvSeries> findAll();
	public TvSeries findOne(String TvId);
	public TvSeries create(TvSeries tv);
	public TvSeries update(String TvId,  TvSeries tv);
	public void delete(String TvId);
}
