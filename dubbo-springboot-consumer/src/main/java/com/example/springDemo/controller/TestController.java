package com.example.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.UserService;
import com.dubbo.demo.bean.PageRequest;
import com.dubbo.demo.bean.user.User;
import com.example.springDemo.support.DemoServiceSupport;

/**
 * @author bennet-xiao
 * @create_time 2018-04-21 22:19:38
 * @todo Test controller
 * @class com.example.springDemo.controller.TestController
 */
@RequestMapping("/hello/")
@Controller
public class TestController {

	@Autowired
	private DemoServiceSupport demoServiceSupport;
	
	@Reference
	private UserService userService;

	@RequestMapping("{name}")
	public @ResponseBody String hello(@PathVariable String name) {
		return demoServiceSupport.sayHello(name);
	}
	
	@RequestMapping("users")
	public @ResponseBody List<User> getUsers(){
		PageRequest pageRequest = PageRequest.of(2, 0);
		return userService.getUsers(pageRequest);
	}
	
	@RequestMapping("add/user")
	@ResponseBody
	public String addUser(@RequestBody User user){
		boolean addedUser = userService.addUser(user);
		if(addedUser) {
			return "success";
		}
		return "fail";
	}
	
	@RequestMapping("add/user/index")
	public  String addUserIndex() {
		return "addUser";
	}
	
}
