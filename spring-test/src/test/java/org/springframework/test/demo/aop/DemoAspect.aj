package org.springframework.test.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author tianshu
 * @date 2019/7/17
 */
@Aspect
@Component
public class DemoAspect {

	@Pointcut("execution(* org.springframework.test.demo.aop.service.*.*(..))")
	public void pointcut(){

	}
	@Before("execution(* org.springframework.test.demo.aop.service.*.*(..))")
	public void before(){
		System.err.println("悟空");
	}

	@Before("execution(* org.springframework.test.demo.aop.service.*.*(..))")
	public void after(){
		System.err.println("或好人帅");
	}

	@Around("execution(* org.springframework.test.demo.aop.service.*.*(..))")
	public void around(ProceedingJoinPoint point){
		long l = System.currentTimeMillis();
		try {
			point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		long e = 	System.currentTimeMillis();
		System.err.println(e-l);

	}
}
