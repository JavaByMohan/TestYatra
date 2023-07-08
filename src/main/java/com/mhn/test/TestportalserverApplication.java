package com.mhn.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestportalserverApplication implements CommandLineRunner {
	/*
	 * @Autowired private UserServices services;
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestportalserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		

		/*
		 * User user = new User(); user.setFirstName("mohan");
		 * user.setLastName("yadav"); user.setUserName("Mohan@1998");
		 * user.setPassword("qwertyu"); user.setEmail("mohn1329@gmail.com");
		 * 
		 * Role role = new Role(); role.setRoleId(44L); role.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> userRoleSet =new HashSet<>(); UserRole userRole = new
		 * UserRole(); userRole.setRole(role); userRole.setUser(user);
		 * userRoleSet.add(userRole);
		 * 
		 * 
		 * User user2 = this.services.createUser(user, userRoleSet);
		 * System.out.println(user2.getUserName());
		 */
	}

}
