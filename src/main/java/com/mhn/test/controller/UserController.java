package com.mhn.test.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhn.test.entity.Role;
import com.mhn.test.entity.User;
import com.mhn.test.entity.UserRole;
import com.mhn.test.service.UserServices;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserServices services;

	@PostMapping("/")
	public User createUse(@RequestBody User user) throws Exception {

		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleId(56L);
		role.setRoleName("NORMAL");

		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);

		roles.add(userRole);

		return this.services.createUser(user, roles);

	}

	@GetMapping("/{username}")
	public User getUserName(@PathVariable("username") String username) {
		return this.services.getUser(username);
	}
	

	// delete user by Id
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.services.deleteUser(userId);

	}
}
