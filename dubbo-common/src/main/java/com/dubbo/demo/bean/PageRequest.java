package com.dubbo.demo.bean;

import java.io.Serializable;

/**传参类，此类必须序列化,必须提供无参构造方法
 * @author bennet-xiao
 * @create_time 2018-06-28 22:55:54
 * @todo 用来代替spring data的pageRequest无法序列化后呗provider接收
 * @class com.dubbo.demo.bean.PageRequest
 */
public class PageRequest implements Serializable {

	/**
	 * 序列id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 每页多少数据
	 */
	private int pageSize;

	/**
	 * 当前页数
	 */
	private int pageNumber;

	private PageRequest(int pageSize, int pageNumber) {
		super();
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
	}

	@Deprecated
	public PageRequest() {
		super();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public static PageRequest of(int pageSize, int pageNumber) {
		return new PageRequest(pageSize, pageNumber);
	}

}
