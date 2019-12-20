package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.UserDaoMapper;
import com.how2java.pojo.UserDao;
import com.how2java.service.UserDaoService;

@Service
public class UserDaoServiceImpl  implements UserDaoService{
	@Autowired
	UserDaoMapper userdaoMapper;
	
	
	public List<UserDao> list(){
		return userdaoMapper.list();
	};

}
