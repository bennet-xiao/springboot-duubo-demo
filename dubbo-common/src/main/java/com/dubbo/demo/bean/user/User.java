package com.dubbo.demo.bean.user;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dubbo.demo.bean.BaseDomain;

/**
 * @author bennet-xiao
 * @create_time 2018-06-05 22:27:03
 * @todo TODO
 * @class com.dubbo.demo.bean.user.User
 */
@Entity
@Table(name = "t_user")
public class User extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "uuid")
	private String uuid = UUID.randomUUID().toString().replace("-", "");

	@Column(name = "user_address")
	private String userAddress;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
