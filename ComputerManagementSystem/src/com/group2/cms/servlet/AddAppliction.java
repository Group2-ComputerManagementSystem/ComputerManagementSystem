package com.group2.cms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.Application;
import com.group2.cms.service.IApplicationService;
import com.group2.cms.service.impl.ApplicationService;
import com.group2.cms.util.UUIDUtil;

/**
 * 添加申请
 * @author 曾远洋
 * @time 2019年12月16日下午4:59:38
 * @version V1.0
 */
public class AddAppliction extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IApplicationService applicationService = new ApplicationService();
		Application application = new Application();
		application.setApplicationId(UUIDUtil.getUUID());
		application.setApplicationState(0);
		application.setApplicationTime((String)request.getSession().getAttribute("time"));
		application.setApplicationReply("");
		application.setComputerhouseNo(request.getParameter("computerhouseNo"));
		application.setTeacherNo(request.getParameter("teacherNo"));
		application.setCourseNo(request.getParameter("courseNo"));
		int num = applicationService.creatApplication(application);
		System.out.println(application);
		if(num > 0) {
			response.sendRedirect(request.getContextPath()+"/servlet/applicationmanager.action");
		}else {
			//错误界面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
