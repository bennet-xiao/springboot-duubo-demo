package com.example.springDemo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.UserService;
import com.dubbo.demo.bean.PageRequest;
import com.dubbo.demo.bean.user.User;
import com.example.springDemo.repository.UserRepository;

/**
 * userService imp
 * 
 * @author bennet-xiao
 * @create_time 2018-06-05 22:47:04
 * @todo TODO
 * @class com.example.springDemo.imp.UserServiceImp
 */
//@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		Pageable pageable = org.springframework.data.domain.PageRequest.of(0, 2, Direction.DESC, "lastUpdateTime");
		Page<User> pages = userRepository.findAll(pageable);
		return pages.getContent();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		User savedUser = userRepository.save(user);
		if (savedUser != null) {
           return true;
		}
		return false;
	}

}
