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

	

	
	

	

}
