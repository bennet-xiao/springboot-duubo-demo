package com.example.springDemo.support;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.DemoService;

/**
 * @author bennet-xiao
 * @create_time 2018-04-21 22:17:58
 * @todo TODO
 * @class com.example.springDemo.support.DemoServiceSupport
 */
@Component
public class DemoServiceSupport {

	@Reference
	private DemoService demoService;
	
	public String sayHello(String name) {
		return demoService.sayHello(name);
	}
}
