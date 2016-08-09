/*   
 * Project: OSMP
 * FileName: UserServiceImpl.java
 * version: V1.0
 */
package com.osmp.test.service.user.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osmp.jdbc.support.JdbcDao;
import com.osmp.test.service.user.UserService;

/**
 * Description:
 * 
 * @author: wangkaiping
 * @date: 2014年11月28日 下午5:28:39
 */
@Service
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private JdbcDao jdbcDao;
	
	@Override
	public Object getUserName(String name) {
		 jdbcDao.update("jwms.update.area.time", "jwms", new Date(),"app001301");
		return "success";
	}

	
	@Override
	public String getUserAge(String age) {
		System.out.println("this user age is :" + age);
		this.get();
		return "userage isdss : " + age;
	}
	
	public int get(){
		return 1;
	}

}
