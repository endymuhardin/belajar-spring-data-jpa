package com.muhardin.endy.software.belajar.spring.data.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muhardin.endy.software.belajar.spring.data.jpa.dao.UserDao;
import com.muhardin.endy.software.belajar.spring.data.jpa.domain.User;
import com.muhardin.endy.software.belajar.spring.data.jpa.service.AccessControlService;

@Service @Transactional
public class AccessControlServiceImpl implements AccessControlService {
	@Autowired private UserDao userDao;

	@Override
	public void save(User u) {
		userDao.save(u);
	}

	@Override
	public void delete(User u) {
		userDao.delete(u);
	}

	@Override
	public User findUserById(String id) {
		return userDao.findOne(id);
	}

	@Override
	public Long countUser() {
		// TODO Auto-generated method stub
		return userDao.count();
	}

	@Override
	public List<User> findAllUser(Integer page, Integer rows) {
		return userDao.findAll(new PageRequest(page, rows)).getContent();
	}

	@Override
	public Long countUserByUsername(String username) {
		return userDao.countByUsername(username);
	}

	@Override
	public List<User> findUserByUsername(String username, Integer page,
			Integer rows) {
		return userDao.findByUsername(username, new PageRequest(page,rows));
	}
	
	
}
