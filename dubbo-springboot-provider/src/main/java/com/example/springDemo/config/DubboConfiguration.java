package com.example.springDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * @author bennet-xiao
 * @create_time 2018-04-23 21:52:42
 * @todo dubbo configuration in java code style
 * @class com.example.springDemo.config.DubboConfiguration
 */
@Configuration
public class DubboConfiguration {

	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${dubbo.registry.address}")
	private String registryAddress;
	
	@Value("${dubbo.protocol.name}")
	private String protocolName;
	
	@Value("${dubbo.protocol.port}")
	private int protocolPort;
	
	
	/**
	 * @author bennet-xiao
	 * @create_time 2018-04-21 21:34:05
	 * @todo set ApplicationConfig in dubbo
	 * @return
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		return new ApplicationConfig(applicationName);
	}
	
	/**
	 * @author bennet-xiao
	 * @create_time 2018-04-21 21:34:29
	 * @todo set RegistryConfig center in dubbo
	 * @return
	 */
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig=new RegistryConfig();
		registryConfig.setAddress(registryAddress);
		return registryConfig;
	}
	
	/**
	 * @author bennet-xiao
	 * @create_time 2018-04-21 21:34:53
	 * @todo set ProtocolConfig in dubbo
	 * @return
	 */
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig=new ProtocolConfig();
		protocolConfig.setName(protocolName);
		protocolConfig.setPort(protocolPort);
		return protocolConfig;
	}
}
