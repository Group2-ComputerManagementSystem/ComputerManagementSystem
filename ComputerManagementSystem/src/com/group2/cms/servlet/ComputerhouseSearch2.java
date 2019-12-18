package com.group2.cms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.ComputerHouse;
import com.group2.cms.service.IComputerHouseService;
import com.group2.cms.service.impl.ComputerHouseService;

/**
 * 根据条件查找对应机房
 * @author 曾远洋
 * @time 2019年12月16日上午11:55:35
 * @version V1.0
 */
public class ComputerhouseSearch2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IComputerHouseService computerHouseService = new ComputerHouseService();
		String startWeek = request.getParameter("start_week");
		String endWeek = request.getParameter("end_week");
		String computerhouseDay = request.getParameter("day");
		String computerhouseLesson = request.getParameter("lesson");
		List<ComputerHouse> comList = computerHouseService.searchComputerHouseByCondition(startWeek,endWeek,computerhouseDay,computerhouseLesson);
		if(comList != null) {
			request.setAttribute("comList", comList);
			request.getSession().setAttribute("time", startWeek+"-"+endWeek+"-"+computerhouseDay+"-"+computerhouseLesson);
			request.getRequestDispatcher("/Home/computerhouseSearch.jsp").forward(request, response);
		}else {
			//错误页面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
