package org.springframework.test.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.demo.tx.AppConfig;
import org.springframework.test.demo.tx.GoodService;
import org.springframework.test.demo.tx.HelloService;

/**
 * Hello world!
 */
public class AppMain {
	public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config.xml");
//		loadXml();
		loadConf();

	}

	private static void loadConf() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = (HelloService) applicationContext.getBean("helloService");
//		TxService txService = (TxService) applicationContext.getBean("txService");
		System.err.println(helloService);
//		System.err.println(txService);
		helloService.hello(8);
	}

	private static void loadXml() {

		String XMLPath = "F:\\git_a\\spring-framework\\spring-test\\src\\test\\java\\org\\springframework\\test\\demo\\config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
		HelloService helloService = (HelloService) applicationContext.getBean("helloService");
		GoodService goodService = (GoodService) applicationContext.getBean("goodService");
//		TxService txService = (TxService) applicationContext.getBean("goodService");
//		System.err.println(txService);
//		txService.execute();
		goodService.say();
	}
}
