package org.springframework.test.demo.shabi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/17
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Shabi {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Shabi.class);
		ShabiBean shabiBean =   context.getBean(ShabiBean.class);
		shabiBean.excute();

		System.err.println("你好");


	}
}
