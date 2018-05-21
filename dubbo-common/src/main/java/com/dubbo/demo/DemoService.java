package com.dubbo.demo;


/**
 * @author bennet-xiao
 * @create_time 2018-04-21 18:00
 * @todo common interface for dubbo provider and consumer
 * @class com.dubbo.demo.DemoService
 */
public interface DemoService {
	/**
	 * @author bennet-xiao
	 * @create_time 2018-04-21 18:03
	 * @todo say hello for the name
	 * @param name
	 * @return hello name
	 */
	public String sayHello(String name);
}
