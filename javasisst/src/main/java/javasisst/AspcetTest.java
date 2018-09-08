package javasisst;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * @author bennet
 * @create_time 2018-09-08 16:42:57
 * @todo 切面测试类
 * @class javasisst.AspcetTest
 */
public class AspcetTest {

	private final static Logger logger = LogManager.getLogger(AspcetTest.class);

	/**
	 * the key for log
	 */
	public final static String LOGKEY = "traceId";

	/**
	 * @author bennet-xiao
	 * @create_time 2018-09-08 16:43:48
	 * @todo 在MDC中添加traceId
	 */
	public static void addTraceIdInMDC() {
		logger.info("进入切面方法");
		// log4j 2.x中不存在MDC类 详见
		// https://logging.apache.org/log4j/2.x/manual/thread-context.html
		String value = ThreadContext.get(LOGKEY);
		// 不存在放入traceId
		if (StringUtils.isEmpty(value)) {
			String traceId = uuidGenrator();
			logger.info("生成traceId【{}】", traceId);
			ThreadContext.put(LOGKEY,traceId);
		}
	}

	/**
	 * @author bennet-xiao
	 * @create_time 2018-09-08 16:56:10
	 * @todo 简单实现生成traceId方法
	 * @return
	 */
	private static String uuidGenrator() {
		return UUID.randomUUID().toString();
	}
}
