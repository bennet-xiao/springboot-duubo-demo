package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan({"com.example.springDemo"})
public class DubboSpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
	}
}
