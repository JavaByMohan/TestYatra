package com.mhn.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhn.test.entity.Role;

public interface RoleRepositotry extends JpaRepository<Role, Long> {

}
