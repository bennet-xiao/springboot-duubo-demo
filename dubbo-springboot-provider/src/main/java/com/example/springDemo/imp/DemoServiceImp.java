package com.example.springDemo.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.DemoService;


/**
 * @author bennet-xiao
 * @create_time 2018-04-23 21:53:58
 * @todo TODO
 * @class com.example.springDemo.imp.DemoServiceImp
 */
@Service
public class DemoServiceImp implements DemoService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello,"+name;
	}

}
