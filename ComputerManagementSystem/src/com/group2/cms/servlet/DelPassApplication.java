package com.group2.cms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.service.IApplicationService;
import com.group2.cms.service.impl.ApplicationService;

/**
 * 删除申请
 * @author 曾远洋
 * @time 2019年12月17日上午9:35:39
 * @version V1.0
 */
public class DelPassApplication extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IApplicationService applicationService = new ApplicationService();
		String applicationId = request.getParameter("applicationId");
		int num = applicationService.removeAppliction(applicationId);
		if(num > 0) {
			response.sendRedirect(request.getContextPath()+"/servlet/showPassCourse.action");
		}else {
			//显示错误界面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
