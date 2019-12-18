package com.group2.cms.dao;

import java.sql.SQLException;

import com.group2.cms.pojo.Teacher;
import com.group2.cms.pojo.User;
/**
 * 
 * @author zk
 * 2019年12月16日下午6:56:13
 */
public interface IUserDao {
	//查询出数据库的数据用来和用户输入的对比 返回一个user对象
	public User selectUserByNameAndPwd(String userName, String userPwd) throws SQLException;
	
	//想拿到teacher对象的数据，我不改动 这里添加一个对象出来
	public Teacher selectTeacherByNameAndPwd(String userName,String usePwd) throws SQLException;
	
	
	//添加用户注册
	public int insertUser(User user) throws SQLException;
	
	
	//添加到teachermsg表里面
	
	public int insertTeacher(Teacher teacher) throws SQLException;
	

}
