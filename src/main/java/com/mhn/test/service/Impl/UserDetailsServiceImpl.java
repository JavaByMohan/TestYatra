package com.mhn.test.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mhn.test.entity.User;
import com.mhn.test.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = this.repository.findByUsername(username);
		if (user == null) {
			System.out.println("user not foud");
			throw new UsernameNotFoundException("No User found !! ");
		}
		return user;
	}

}
