package javasisst;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * @author bennet
 * @create_time 2018-09-08 16:42:57
 * @todo ���������
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
	 * @todo ��MDC�����traceId
	 */
	public static void addTraceIdInMDC() {
		logger.info("�������淽��");
		// log4j 2.x�в�����MDC�� ���
		// https://logging.apache.org/log4j/2.x/manual/thread-context.html
		String value = ThreadContext.get(LOGKEY);
		// �����ڷ���traceId
		if (StringUtils.isEmpty(value)) {
			String traceId = uuidGenrator();
			logger.info("����traceId��{}��", traceId);
			ThreadContext.put(LOGKEY,traceId);
		}
	}

	/**
	 * @author bennet-xiao
	 * @create_time 2018-09-08 16:56:10
	 * @todo ��ʵ������traceId����
	 * @return
	 */
	private static String uuidGenrator() {
		return UUID.randomUUID().toString();
	}
}
