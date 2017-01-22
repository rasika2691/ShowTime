package io.rasika.ShowTime.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.User;
@Repository
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em1;
	@Override
	public List<User> findAll() {
   	TypedQuery<User> query=em1.createNamedQuery("User.findAll",User.class);
   		return query.getResultList();	
	}

	@Override
	public User findOne(String uId) {
		return em1.find(User.class,uId);
	}
	
	@Override
	public User findByEmail(String email) {
		TypedQuery<User> query=em1.createNamedQuery("User.findByEmail",User.class);
		query.setParameter("pEmail", email);
		List<User> users=query.getResultList();
		if(users!=null && users.size()==1){
			return users.get(0);
		}
		return null;
	}

	@Override
	public User create(User ur) {
		 em1.persist(ur);
		 return ur;
		
	}

	@Override
	public User update(User ur) {
		return em1.merge(ur);
	}

	@Override
	public void delete(User ur) {
		em1.remove(ur);
	}

	

	

}
