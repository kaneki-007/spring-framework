package org.springframework.test.demo.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tianshu
 * @desc:
 * @date 2019/7/17
 */
@Service
public class TxService {

	@Autowired
	private TxService txService;

//	@Transactional
	public void execute(){
		System.err.println("你好");
		txService.execute();
	}
}
