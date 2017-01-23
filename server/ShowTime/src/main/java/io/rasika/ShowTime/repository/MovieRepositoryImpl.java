package io.rasika.ShowTime.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.Movie;
@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Movie>query = em.createNamedQuery("Movie.findAll",Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie findOne(String mId) {
		// TODO Auto-generated method stub
		return em.find(Movie.class, mId);
	}

	@Override
	public Movie findByTitle(String title) {
		// TODO Auto-generated method stub
		TypedQuery<Movie>query = em.createNamedQuery("Movie.findByTitle",Movie.class);
		query.setParameter("pTitle", title);
		
		List<Movie>movies = query.getResultList();
		if(movies != null && movies.size()==1)
		{
			return movies.get(0);
		}
		else{
			return null;
		}
	
	}
	
	@Override
	public Movie create(Movie mv) {
		// TODO Auto-generated method stub
		em.persist(mv);
		return mv;
	}

	@Override
	public Movie update(Movie mv) {
		// TODO Auto-generated method stub
		return em.merge(mv);
	}
	
	@Override
	public void delete(Movie mv) {
		// TODO Auto-generated method stub
		em.remove(mv);
	}

	@Override
	public List<Movie> findByType(String type) {
		// TODO Auto-generated method stub
		TypedQuery<Movie>query =em.createNamedQuery("Movie.findByType",Movie.class);
		query.setParameter("pType", type);
		List<Movie>movies = query.getResultList();
		if(movies != null && movies.size()>0){
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> findByYear(int year) {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.findByYear", Movie.class);
		query.setParameter("pYear", year);
		List<Movie> movies=query.getResultList();
		
		if(movies!=null && movies.size()>0){
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.findByGenre",Movie.class);
		query.setParameter("pGenre", genre);
		List<Movie> movies=query.getResultList();
		if(movies!=null && movies.size()>0)
		{
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> sortByImdbRatings() {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.sortByImdbRatings",Movie.class);
		List<Movie> movies=query.getResultList();
		
		if(movies!=null && movies.size()>0)
		{
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> sortByYear() {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.sortByYear",Movie.class);
		List<Movie> movies=query.getResultList();
		
		if(movies!=null && movies.size()>0){
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> sortByImdbVotes() {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.sortByImdbVotes",Movie.class);
		List<Movie> movies=query.getResultList();
		
		if(movies!=null && movies.size()>0){
			return movies;
		}
		return null;
	}

	@Override
	public List<Movie> topRatedMovies() {
		// TODO Auto-generated method stub
		TypedQuery<Movie>query = em.createNamedQuery("movie.topRatedMovies",Movie.class);
		query.setParameter("pType", "movie");
		query.setParameter("pLimit", 8.0);
		List<Movie>movies = query.getResultList();
		return movies;
	}

	@Override
	public List<Movie> topRatedSeries() {
		// TODO Auto-generated method stub
		TypedQuery<Movie> query=em.createNamedQuery("Movie.topRatedSeries",Movie.class);
		query.setParameter("pType", "series");
		query.setParameter("pLimit", 9.0);
		List<Movie> movies=query.getResultList();
		return movies;
		
	}

	

	
	

	

}
