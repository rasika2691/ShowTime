package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.User;
@Service
public interface UserService {

	public List<User> findAll();
	public User findOne(String uId);
	public User create(User ur);
	public User update(String uId,  User ur);
	public void delete(String uId);
}
