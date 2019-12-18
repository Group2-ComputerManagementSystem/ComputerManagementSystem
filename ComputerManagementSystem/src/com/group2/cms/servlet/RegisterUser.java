package com.group2.cms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.Teacher;
import com.group2.cms.pojo.User;
import com.group2.cms.service.IUserService;
import com.group2.cms.service.impl.UserService;
import com.group2.cms.util.UUIDUtil;
/**
 * 注册
 * @author zk
 * 2019年12月16日下午7:16:14
 */

public class RegisterUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//得到表单数据
		
		String userName= request.getParameter("form-first-name");
		String userPwd = request.getParameter("form-last-name");
		//放入对象中
		User user = new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setUserID(UUIDUtil.getUUID());
		
		
		//放入另一张表的对象中
		Teacher teacher = new Teacher();
		teacher.setTeacherName(userName);
		teacher.setTeacherPwd(userPwd);
		teacher.setTeacherId(UUIDUtil.getUUID());
		
		//将拿到的数据封装到对象中了后，传入业务层
		request.setAttribute("teacher", teacher);
		IUserService is1 = new UserService();
		is1.insertTeacher(teacher);
		
		//放入request
		request.setAttribute("user", user);
		IUserService  is = new UserService();
		int i = is.insertUser(user);
		System.out.println(i);
		if(i>0) {
			//注册成功重定向到成功页面
			response.sendRedirect(request.getContextPath()+"/Login/login.jsp");
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	

}
