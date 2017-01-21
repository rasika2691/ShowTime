package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.User;
import io.rasika.ShowTime.exception.BadRequestException;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired 
   private UserRepository repository;
	
	@Override
	public List<User>findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User findOne(String uId) {
		// TODO Auto-generated method stub
		User ur = repository.findOne(uId);
		if(ur == null){
			throw new EntityNotFoundException("Employee not found");
		}
		return ur;
	}

	@Override
	public User create(User ur) {
		// TODO Auto-generated method stub
		User existing = repository.findByEmail(ur.getEmail());
		if(existing != null){
			throw new BadRequestException("Employee already exist");
		}
		return repository.create(ur);
	}

	@Override
	public User update(String uId, User ur) {
		// TODO Auto-generated method stub
		User existing = repository.findOne(uId);
		if(existing == null){
			throw new EntityNotFoundException("User Not found!");
		}
		return repository.update(uId, ur);
	}

	@Override
	public void delete(String uId) {
		// TODO Auto-generated method stub

		User ur = repository.findOne(uId);
		if(ur == null){
			throw new EntityNotFoundException("User Not Found");
		}
		 repository.delete(uId);
	}

}
