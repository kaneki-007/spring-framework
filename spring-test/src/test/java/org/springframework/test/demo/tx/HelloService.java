package org.springframework.test.demo.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/16
 */

@Service
public class HelloService{



	public void hello(Integer id) {
		System.err.println("service hello");
	}
}
