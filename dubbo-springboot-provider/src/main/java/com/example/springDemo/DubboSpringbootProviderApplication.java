package com.example.springDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan({"com.example.springDemo"})
@EntityScan(value="com.dubbo.demo.bean")
@MapperScan("com.example.springDemo.mapper")
public class DubboSpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootProviderApplication.class, args);
	}
}
