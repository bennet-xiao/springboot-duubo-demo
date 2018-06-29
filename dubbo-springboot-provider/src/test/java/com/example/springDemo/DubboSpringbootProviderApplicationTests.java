package com.example.springDemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dubbo.demo.UserService;
import com.dubbo.demo.bean.PageRequest;
import com.dubbo.demo.bean.user.User;
import com.example.springDemo.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboSpringbootProviderApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		List<User> users = userService.getUsers(PageRequest.of(2, 0));
		System.out.println(users.size());
	}

}
