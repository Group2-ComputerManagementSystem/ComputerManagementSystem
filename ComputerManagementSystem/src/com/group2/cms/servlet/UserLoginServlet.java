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
/**
 * 
 * @author zk
 * 2019年12月16日下午6:56:59
 */
public class UserLoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//拿到form表单数据
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		//拿到数据库的数据
		IUserService  is = new UserService();
		User user = is.searchUser(userName, userPwd);
		
		//拿到teacher里面 数据
		Teacher teacher = is.searchTeacher(userName, userPwd);
		
		//他想把这个对象放在session里面并且要求key=teacher
		
		
		//比对是否一致一致级登录不一致就重定向
		if("admin".equals(userName) && "admin".equals(userPwd)) {
			Teacher teacher_manager = new Teacher();
			teacher_manager.setTeacherName("admin");
			request.getSession().setAttribute("teacher", teacher_manager);
			response.sendRedirect(request.getContextPath()+"/Home/home.jsp");
		}else if(user != null ) {
			if(user.getUserName().equals(userName) && (user.getUserPwd().equals(userPwd))) {
				//重定向到home页面
				request.getSession().setAttribute("teacher", teacher);
				response.sendRedirect(request.getContextPath()+"/Home/home.jsp");
			} 
		}else {
			//重定向回登录页面
			response.sendRedirect(request.getContextPath()+"/Login/login.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
