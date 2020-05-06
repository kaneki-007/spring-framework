package org.springframework.test.demo.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.ServerError;

/**
 * @author tianshu
 * @desc:
 * @date 2020/4/24
 */
@Service
public class GoodServiceImpl implements  GoodService{

	@Autowired
	private GoodService goodService;

//	@Transactional
	@Override
	public void say() {
		goodService.say();
		System.err.println(999);
	}
}
