package javasisst;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * @author bennet
 * @create_time 2018-09-08 18:38:31
 * @todo ���c�yԇ
 * @class javasisst.AspectPointTest
 */
public class AspectPointTest {
	
	private final static Logger logger=LogManager.getLogger(AspectPointTest.class);	

	/**
	 * @author bennet-xiao
	 * @create_time 2018-09-08 17:38:57
	 * @todo  �򵥵ķ���
	 */
	public void helloWorld() {
        logger.info("hello world!"+ThreadContext.get(AspcetTest.LOGKEY));
	}
}
