package org.springframework.test.demo.shabi;


import org.aspectj.lang.JoinPoint;
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
public class WeiAspect {


	// 定义切点（切入位置）
	@Pointcut("execution(* org.springframework.test.demo.shabi.ShabiBean.*(..))")
	private void point(){}


	@Before("point()")
	public void before(JoinPoint joinPoint){
		System.out.println("前置傻逼你");
	}

	@Around("point()")
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
