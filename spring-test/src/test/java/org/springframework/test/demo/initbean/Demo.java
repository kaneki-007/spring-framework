package org.springframework.test.demo.initbean;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/12
 */
public class Demo {
	public static void main(String[] args){
		ClassLoader classLoader =Demo.class.getClassLoader();
		System.err.println(classLoader);
	}
}
