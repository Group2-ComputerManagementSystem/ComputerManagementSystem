package com.group2.cms.service;

import com.group2.cms.pojo.Teacher;
import com.group2.cms.pojo.User;
/**
 * 
 * @author zk
 * 2019年12月16日下午6:56:47
 */

//业务层接口 说白了就是调方法执行 dao 登录
public interface IUserService {
	//查出user作为登录的对比
	public User searchUser(String userName,String userPwd); 
	//本来可以在teacher里面一并查询，但是防止修改我这里直接添加一个teacher
	
	public Teacher searchTeacher(String userName,String userPwd);
	
	//注册
	public int insertUser(User user);
	
	//放在teacher里面
	
	public int insertTeacher(Teacher teacher);

}
