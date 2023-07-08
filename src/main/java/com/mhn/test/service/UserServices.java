package com.mhn.test.service;

import java.util.Set;

import com.mhn.test.entity.User;
import com.mhn.test.entity.UserRole;

public interface UserServices {

	// creating user

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	// get User

	public User getUser(String username);

	// delete user by Id

	public void deleteUser(Long userId);
}
