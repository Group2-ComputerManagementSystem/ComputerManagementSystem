package com.group2.cms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.Teacher;
import com.group2.cms.service.ITeacherService;
import com.group2.cms.service.impl.TeacherService;

/**
 * 
 * @author 曾远洋
 * @time 2019年12月15日下午3:16:56
 * @version V1.0
 */
public class Logincheck extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ITeacherService teacherService = new TeacherService();
		String teacherName = request.getParameter("userName");
		String teacherPwd = request.getParameter("userPwd");
		Teacher teacher = teacherService.searchTeacher(teacherName,teacherPwd);
		if(teacher != null) {
			request.getSession().setAttribute("teacher", teacher);
			response.sendRedirect(request.getContextPath()+"/Home/home.jsp");
		}else {
			//跳转错误页面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
