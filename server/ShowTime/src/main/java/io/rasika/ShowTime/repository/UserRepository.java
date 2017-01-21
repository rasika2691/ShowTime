package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.User;
@Repository
public interface UserRepository {
	public List<User>findAll();
	public User findOne(String uId);
	public User findByEmail(String email);
	public User create(User ur);
	public User update(String uId,  User ur);
	public void delete(String uId);
}
