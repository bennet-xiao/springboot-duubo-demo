package com.dubbo.demo;

import java.util.List;

import com.dubbo.demo.bean.PageRequest;
import com.dubbo.demo.bean.user.User;

/**
 * user interface
 * 
 * @author bennet-xiao
 * @create_time 2018-06-05 22:05:44
 * @todo TODO
 * @class com.dubbo.demo.UserService
 */
public interface UserService {

	/**
	 * 获取用户列表
	 * 
	 * @author bennet-xiao
	 * @create_time 2018-06-05 22:38:45
	 * @todo get all users
	 * @return
	 */
	List<User> getUsers(PageRequest pageable);

	/**
	 * 增加用户
	 * 
	 * @author bennet-xiao
	 * @create_time 2018-06-10 10:28:09
	 * @todo TODO
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
}
