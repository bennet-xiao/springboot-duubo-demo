package com.dubbo.demo.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * common entity
 * 
 * @author bennet-xiao
 * @create_time 2018-06-05 22:09:43
 * @todo TODO
 * @class com.dubbo.demo.bean.BaseDomain
 */
@MappedSuperclass
public class BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "last_update_time")
	private LocalDateTime lastUpdateTime = LocalDateTime.now();

	@Column(name = "create_time")
	private LocalDateTime createTime = LocalDateTime.now();

	@Column(name = "is_valid")
	private byte isValid = 1;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public byte getIsValid() {
		return isValid;
	}

	public void setIsValid(byte isValid) {
		this.isValid = isValid;
	}
}
