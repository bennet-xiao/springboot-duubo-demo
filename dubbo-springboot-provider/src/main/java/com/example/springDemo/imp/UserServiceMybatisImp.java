package com.example.springDemo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.UserService;
import com.dubbo.demo.bean.PageRequest;
import com.dubbo.demo.bean.user.User;
import com.example.springDemo.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * mybatis实现
 * 
 * @author bennet-xiao
 * @create_time 2018-06-19 21:43:37
 * @todo TODO
 * @class com.example.springDemo.imp.UserServiceMybatisImp
 */
@Service
public class UserServiceMybatisImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUsers(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		// Pageable pageable = PageRequest.of(0, 2);
		PageHelper.startPage(pageRequest.getPageNumber(), pageRequest.getPageSize());
		List<User> users = userMapper.findUsers();
//		PageInfo<User> pageInfo=new PageInfo<User>(users);
		return users;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
		return true;
	}

}
