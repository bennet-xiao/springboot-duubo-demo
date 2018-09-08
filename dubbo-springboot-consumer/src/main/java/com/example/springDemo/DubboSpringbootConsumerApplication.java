package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@DubboComponentScan({ "com.example.springDemo" })
public class DubboSpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
	}
}
