package org.springframework.test.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.demo.aop.service.UserService;
import org.springframework.test.demo.aop.service.UserServiceImpl;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/17
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("org.springframework.test.demo.aop.*")
public class App {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
		System.err.println(userService);
		userService.login();

	}
}
