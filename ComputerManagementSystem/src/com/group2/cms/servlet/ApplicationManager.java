package com.group2.cms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.Application_Flag;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.service.IApplicationService;
import com.group2.cms.service.impl.ApplicationService;

/**
 * 显示我的申请
 * @author 曾远洋
 * @time 2019年12月16日下午6:37:57
 * @version V1.0
 */
public class ApplicationManager extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IApplicationService applicationService = new ApplicationService();
		String teacherNo = ((Teacher)request.getSession().getAttribute("teacher")).getTeacherNo();
		List<Application_Flag> appList = applicationService.searchMyAppliction(teacherNo);
		if(appList != null) {
			request.setAttribute("appList", appList);
			request.getRequestDispatcher("/Home/teacherApplication_manager.jsp").forward(request, response);
		}else {
			//错误界面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
