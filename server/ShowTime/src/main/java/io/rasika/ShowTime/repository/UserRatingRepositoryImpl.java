package io.rasika.ShowTime.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.UserRating;
@Repository
public class UserRatingRepositoryImpl implements UserRatingRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<UserRating> findAll() {
		TypedQuery<UserRating> query=em.createNamedQuery("UserRating.findAll",UserRating.class);
		return query.getResultList();	
	}

	@Override
	public UserRating create(UserRating UserRat) {
		// TODO Auto-generated method stub
		em.persist(UserRat);
		return UserRat;
	}

	@Override
	public UserRating findOne(String id) {
		// TODO Auto-generated method stub
		return em.find(UserRating.class,id);
	}

	@Override
	public List<UserRating> findAllUserRatingsByMovieId(String id) {
		// TODO Auto-generated method stub
		TypedQuery<UserRating> query=em.createNamedQuery("UserRating.findAllUserRatingsByMovieId",UserRating.class);
		return query.getResultList();
	}

	@Override
	public double findAvgUserRatingsByMovieId(String id) {
		// TODO Auto-generated method stub
		TypedQuery<Double> query=em.createNamedQuery("UserRating.findAvgUserRatingsByMovieId",Double.class);
		query.setParameter("pMovieId", id);
		double avg=query.getSingleResult();
		return avg;
	}

	@Override
	public UserRating update(UserRating UserRat) {
		// TODO Auto-generated method stub
		return em.merge(UserRat);
	}

	@Override
	public void delete(UserRating UserRat) {
		// TODO Auto-generated method stub
		em.remove(UserRat);
	}

}
