package com.group2.cms.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.group2.cms.pojo.Teacher;
import com.group2.cms.service.ITeacherService;
import com.group2.cms.service.impl.TeacherService;

/**
 * 修改教师信息
 * @author 曾远洋
 * @time 2019年12月16日上午9:12:16
 * @version V1.0
 */
public class UpdateTeacher extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ITeacherService teacherService = new TeacherService();
		Teacher teacher = new Teacher();
		try {
			DateConverter dateConverter = new DateConverter();
			dateConverter.setPatterns(new String[] {"yyyy-MM-dd"});
			ConvertUtils.register(dateConverter, Date.class);
			BeanUtils.populate(teacher, request.getParameterMap());
			System.out.println(teacher);
			int num = teacherService.changeTeacherMsg(teacher);
			if(num > 0) {
				request.getSession().setAttribute("teacher", teacher);
				response.sendRedirect(request.getContextPath()+"/Home/center.jsp");
			}else {
				//错误界面
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
