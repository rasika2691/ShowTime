package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.TvSeries;
@Repository
public interface TvSeriesRepository {

	public List<TvSeries> findAll();
	public TvSeries findOne(String TvId);
	public TvSeries findByTitle(String title);
	public TvSeries create(TvSeries tv);
	public TvSeries update(String TvId,  TvSeries tv);
	public void delete(String TvId);
}
