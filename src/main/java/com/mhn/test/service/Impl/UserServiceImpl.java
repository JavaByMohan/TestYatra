package com.mhn.test.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhn.test.entity.User;
import com.mhn.test.entity.UserRole;
import com.mhn.test.repo.RoleRepositotry;
import com.mhn.test.repo.UserRepository;
import com.mhn.test.service.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepositotry roleRepositotry;

	// Creating user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

		User local = this.userRepository.findByUsername(user.getUsername());

		if (local != null) {
			System.out.println("User is already there");
			throw new Exception("User is already present");
		} else {
			for (UserRole ur : userRoles) {
				roleRepositotry.save(ur.getRole());
			}

			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}

		return local;
	}

//getting user by user name
	@Override
	public User getUser(String username) {

		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {

		this.userRepository.deleteById(userId);
	}

}
