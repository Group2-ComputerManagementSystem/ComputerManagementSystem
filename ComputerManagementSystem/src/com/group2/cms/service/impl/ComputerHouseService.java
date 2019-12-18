package com.group2.cms.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.group2.cms.dao.IComputerHouseDao;
import com.group2.cms.dao.impl.ComputerHouseDao;
import com.group2.cms.pojo.ComputerHouse;
import com.group2.cms.pojo.ComputerHouse_Flag;
import com.group2.cms.service.IComputerHouseService;

/**
 * 机房业务层实现类
 * @author 曾远洋
 * @time 2019年12月16日上午10:48:21
 * @version V1.0
 */
public class ComputerHouseService implements IComputerHouseService {
	private IComputerHouseDao computerHouseDao = new ComputerHouseDao();

	@Override
	public List<ComputerHouse_Flag> searchAllComputerHouse() {
		try {
			return computerHouseDao.selectAllComputerHouse();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ComputerHouse> searchComputerHouseByCondition(String startWeek, String endWeek, String computerhouseDay,
			String computerhouseLesson) {
		try {
			return computerHouseDao.selectComputerHouseByCondition(startWeek, endWeek, computerhouseDay, computerhouseLesson);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
