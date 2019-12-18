package com.group2.cms.service.impl;

import java.sql.SQLException;

import com.group2.cms.dao.IUserDao;
import com.group2.cms.dao.impl.UserDao;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.pojo.User;
import com.group2.cms.service.IUserService;
/**
 * 
 * @author zk
 * 2019年12月16日下午6:56:53
 */

public class UserService implements IUserService {

	@Override
	public User searchUser(String userName,String userPwd) {
		IUserDao userDao = new UserDao();
		try {
			return userDao.selectUserByNameAndPwd(userName, userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

	@Override
	public Teacher searchTeacher(String userName, String userPwd) {
		IUserDao userDao = new UserDao();
		try {
			return userDao.selectTeacherByNameAndPwd(userName, userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public int insertUser(User user) {
		IUserDao userDao = new UserDao();
		try {
			return userDao.insertUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insertTeacher(Teacher teacher) {
		IUserDao userDao = new UserDao();
		try {
			return userDao.insertTeacher(teacher);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	

}
