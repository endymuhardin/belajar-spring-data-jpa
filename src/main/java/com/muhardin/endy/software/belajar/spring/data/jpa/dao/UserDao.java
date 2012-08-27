package com.muhardin.endy.software.belajar.spring.data.jpa.dao;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.muhardin.endy.software.belajar.spring.data.jpa.domain.User;

public interface UserDao extends PagingAndSortingRepository<User, String>{

	@Query("select count(u) from User u where u.username = :username")
	Long countByUsername(String username);
	List<User> findByUsername(String username, PageRequest pageRequest);

}
