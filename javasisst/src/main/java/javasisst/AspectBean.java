package javasisst;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author bennet
 * @create_time 2018-09-08 17:31:20
 * @todo 切点测试类
 * @class javasisst.AspectBean
 */
public class AspectBean {
	
	/**
	 * 类名
	 */
	private String className;
	
	/**
	 * 方法名
	 */
	private String methodName;
	
	/**
	 * 切面id
	 */
	private String aspectId;
    
	


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getMethodName() {
		return methodName;
	}


	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}


	public AspectBean(String className, String methodName) {
		super();
		this.className = className;
		this.methodName = methodName;
	}


	public AspectBean() {
		super();
	}


	public String getAspectId() {
		return aspectId;
	}


	public void setAspectId(String aspectId) {
		this.aspectId = aspectId;
	}


	public AspectBean(String className, String methodName, String aspectId) {
		super();
		this.className = className;
		this.methodName = methodName;
		this.aspectId = aspectId;
	}
	
	
	
}
