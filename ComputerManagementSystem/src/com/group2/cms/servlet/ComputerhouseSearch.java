package com.group2.cms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group2.cms.pojo.ComputerHouse_Flag;
import com.group2.cms.service.IComputerHouseService;
import com.group2.cms.service.impl.ComputerHouseService;

/**
 * 显示申请与查询界面
 * @author 曾远洋
 * @time 2019年12月16日上午10:42:10
 * @version V1.0
 */
public class ComputerhouseSearch extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IComputerHouseService computerHouseService = new ComputerHouseService();
		List<ComputerHouse_Flag> computerList = computerHouseService.searchAllComputerHouse();
		if(computerList != null) {
			request.setAttribute("computerList", computerList);
			request.getRequestDispatcher("/Home/computerhouseSearch.jsp").forward(request, response);
		}else {
			//错误界面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
