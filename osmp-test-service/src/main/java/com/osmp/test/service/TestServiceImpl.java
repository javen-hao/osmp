/*   
 * Project: OSMP
 * FileName: TestServiceImpl.java
 * version: V1.0
 */
package com.osmp.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.osmp.intf.define.model.Parameter;
import com.osmp.intf.define.service.BaseDataService;
import com.osmp.test.service.user.UserService;

/**
 * Description:
 * 
 * @author: wangkaiping
 * @date: 2014年9月26日 下午3:03:55
 */
@Component
public class TestServiceImpl implements BaseDataService {

	@Autowired
	private UserService userservice;

	@Override
	public Object execute(Parameter parameter) {
		String name = parameter.getQueryMap().get("name");
		Map<String, String> map = new HashMap<String, String>();
		map.put("arg1", parameter.getQueryMap().get("arg1"));
		map.put("arg2", parameter.getQueryMap().get("arg2"));
//		userservice.getUserName(name);
		map.put("server", "陈本辉环境");
		String str1 = "sicent0000A1000062{\"type\": 1, \"cmd\": \"GetUserBalance\", \"transmitData\": \"{\\\"session_id\\\": 101}\", \"service\": \"Netbar\"}000033{\"snbid\": \"ci052\", \"card_id\": \"510129199909091919\"}";
		return map;
	}

}
