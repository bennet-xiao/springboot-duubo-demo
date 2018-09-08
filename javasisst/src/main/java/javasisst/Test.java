package javasisst;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @author bennet
 * @create_time 2018-09-08 21:14:11
 * @todo ����xml �����޸��ֽ�����
 * @class javasisst.Test
 */
public class Test {

	private final static Logger logger = LogManager.getLogger(Test.class);
	/**
	 * ����map
	 */
	private static Map<String, AspectBean> aspectMap = new HashMap<String, AspectBean>();

	/**
	 * �е�map
	 */
	private static List<AspectBean> aspectPoints = new ArrayList<AspectBean>();

	public static void main(String[] args) throws Exception {		
		aspectXmlParser();
		ClassPool classPool = ClassPool.getDefault();
//		Map<String, CtClass> ctMethods = new HashMap<String, CtClass>();
//		for (Map.Entry<String, AspectBean> mEntry : aspectMap.entrySet()) {
//			CtClass ctClass = classPool.get(mEntry.getValue().getClassName());
//			CtMethod declaredMethod = ctClass.getDeclaredMethod(mEntry.getValue().getMethodName());
//			ctMethods.put(mEntry.getKey(), declaredMethod);
//		}
		for (AspectBean aspectBean : aspectPoints) {
			CtClass ctClass = classPool.get(aspectBean.getClassName());
			CtMethod declaredMethod = ctClass.getDeclaredMethod(aspectBean.getMethodName());
			// ����bean
			AspectBean aspectBean2 = aspectMap.get(aspectBean.getAspectId());
			// ������
			CtClass ctClass2 = classPool.get(aspectBean2.getClassName());
			//�Ǿ�̬����
//			String fieldSrc="public "+ctClass2.getName()+" "+ctClass2.getSimpleName()+";";
//			logger.info("��ӳ�ԱԴ��Ϊ��"+fieldSrc);
			// ��ӳɆT
//			ctClass.addField(new CtField(ctClass2, ctClass2.getSimpleName(), ctClass));
			// ����ǰ����Դ�a
//			String src = "{if("+ctClass2.getSimpleName()+"==null){"+ctClass2.getSimpleName()+"=new "+ctClass2.getName()+"();"+"}"+ ctClass2.getSimpleName() + "." + aspectBean2.getMethodName() + "();}";
			//��̬����ֱ�ӵ���
			String src="{"+ctClass2.getName()+"."+aspectBean2.getMethodName()+"();}";
			logger.info("Դ��Ϊ��" + src);
			declaredMethod.insertBefore(src);
			// ϵͳĬ������class��·�� ��дclass
			ctClass.writeFile(ClassLoader.getSystemResource("").getPath());
		}
		AspectPointTest test = new AspectPointTest();
		test.helloWorld();
	}

	/**
	 * @author bennet-xiao
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 * @create_time 2018-09-08 17:42:21
	 * @todo ��xml����ΪMap
	 */
	private static void aspectXmlParser() throws Exception {
		SAXReader reader = new SAXReader();
		File file = new File(ClassLoader.getSystemResource("").getPath() + "/aspect.xml");
		Document document = reader.read(file);
		// ���ڵ�
		Element root = document.getRootElement();
		if (root == null) {
			throw new NullPointerException("û���ҵ���������棡");
		}
		//����
		@SuppressWarnings("rawtypes")
		Iterator aspects = root.elementIterator("Aspect");
		while (aspects.hasNext()) {
			Element aspect = (Element) aspects.next();
			String aspectId = aspect.element("id").getTextTrim();
			String className = aspect.element("class").getTextTrim();
			String methodName = aspect.element("method").getTextTrim();
			aspectMap.put(aspectId, new AspectBean(className,methodName));
		}
		
        //�е�
		@SuppressWarnings("rawtypes")
		Iterator aspectPointIters= root.elementIterator("AspectPoint");
		while (aspectPointIters.hasNext()) {
			Element aspect = (Element) aspectPointIters.next();
			String aspectId = aspect.element("AspectId").getTextTrim();
			String className = aspect.element("class").getTextTrim();
			String methodName = aspect.element("method").getTextTrim();
			aspectPoints.add(new AspectBean(className,methodName,aspectId));
		}
	}
	
	
	@org.junit.Test
	public void name() {
		AspectPointTest test = new AspectPointTest();
		test.helloWorld();
	}
}
