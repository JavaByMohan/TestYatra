package com.mhn.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhn.test.entity.User;

public interface UserRepository extends JpaRepository<User ,Long> {

	 public User findByUsername(String username);

}
