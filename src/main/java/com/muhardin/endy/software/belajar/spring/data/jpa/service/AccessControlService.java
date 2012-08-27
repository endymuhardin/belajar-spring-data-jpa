package com.muhardin.endy.software.belajar.spring.data.jpa.service;

import java.util.List;

import com.muhardin.endy.software.belajar.spring.data.jpa.domain.User;

public interface AccessControlService {
	public void save(User u);
	public void delete(User u);
	public User findUserById(String id);
	public Long countUser();
	public List<User> findAllUser(Integer page, Integer rows);
	public Long countUserByUsername(String username);
	public List<User> findUserByUsername(String username, Integer page, Integer rows);
}
