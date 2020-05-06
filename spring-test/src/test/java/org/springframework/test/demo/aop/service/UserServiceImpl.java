package org.springframework.test.demo.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/17
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public void login() {
		System.err.println("登录成功");
	}
}
