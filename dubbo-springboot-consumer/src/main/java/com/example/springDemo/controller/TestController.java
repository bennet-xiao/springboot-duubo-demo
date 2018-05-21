package com.example.springDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDemo.support.DemoServiceSupport;

/**
 * @author bennet-xiao
 * @create_time 2018-04-21 22:19:38
 * @todo Test controller
 * @class com.example.springDemo.controller.TestController
 */
@RestController
@RequestMapping("/hello/")
public class TestController {

	@Autowired
	private DemoServiceSupport demoServiceSupport;

	@RequestMapping("{name}")
	public @ResponseBody String hello(@PathVariable String name) {
		return demoServiceSupport.sayHello(name);
	}
}
