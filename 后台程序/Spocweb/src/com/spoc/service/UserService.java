package com.spoc.service;

import java.util.List;

import com.spoc.dao.UserDao;
import com.spoc.po.User;


@SuppressWarnings("unused")
public class UserService
{
	private UserDao userDao;
//	public void add(String username,String password)
//	{
//		System.out.println("UserService.add()");
//		User u=new User();
//		u.setUsername(username);
//		u.setPassword(password);
//		//u.setId(id);
//		userDao.add(u);
//	}

	public boolean find(String username,String password)
	{
		//System.out.println("UserService.add()");
		//System.out.println(username+password);
		boolean flag=userDao.find(username,password);	
		return flag;
	}
	public UserDao getUserDao()
	{
		return userDao;
	}
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

}
