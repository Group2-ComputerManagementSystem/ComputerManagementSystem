package com.group2.cms.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.group2.cms.dao.IUserDao;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.pojo.User;
import com.group2.cms.util.C3P0Util;
/**
 * 
 * @author zk
 * 2019年12月16日下午6:56:37
 */

public class UserDao implements IUserDao {

	@Override
	public User selectUserByNameAndPwd(String userName, String userPwd) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from user where userName =? and userPwd=?", new BeanHandler<User>(User.class),userName,userPwd);
	}
	
	

	@Override
	public Teacher selectTeacherByNameAndPwd(String userName, String usePwd) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql ="SELECT * FROM teachermsg WHERE teacherName=? AND teacherPwd=?";
		return qr.query(sql,new BeanHandler<Teacher>(Teacher.class),userName,usePwd);
	}



	@Override
	public int insertUser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql = "INSERT INTO USER VALUES ('"+user.getUserID()+"','"+user.getUserName()+"','"+user.getUserPwd()+"')";
		return qr.update(sql);
	}

	@Override
	public int insertTeacher(Teacher teacher) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		String sql ="INSERT INTO teachermsg (teacherId,teacherName,teacherPwd) VALUES ('"+teacher.getTeacherId()+"','"+teacher.getTeacherName()+"','"+teacher.getTeacherPwd()+"')";
		return qr.update(sql);
	}
	
	
}
