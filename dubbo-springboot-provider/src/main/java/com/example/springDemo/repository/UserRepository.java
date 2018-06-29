package com.example.springDemo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dubbo.demo.bean.user.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User u")
	Page<User> findAll(Pageable pageable);
}
