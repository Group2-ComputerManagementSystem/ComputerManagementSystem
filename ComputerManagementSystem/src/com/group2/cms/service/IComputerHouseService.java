package com.group2.cms.service;

import java.util.List;

import com.group2.cms.pojo.ComputerHouse;
import com.group2.cms.pojo.ComputerHouse_Flag;

/**
 * 机房业务层接口
 * @author 曾远洋
 * @time 2019年12月16日上午10:47:28
 * @version V1.0
 */
public interface IComputerHouseService {
	/**
	 * 查找所有机房信息
	 * @return
	 */
	public List<ComputerHouse_Flag> searchAllComputerHouse();
	
	/**
	 * 多条件查询机房
	 * @param startWeek
	 * @param endWeek
	 * @param computerhouseDay
	 * @param computerhouseLesson
	 * @return
	 */
	public List<ComputerHouse> searchComputerHouseByCondition(String startWeek, String endWeek, String computerhouseDay,
			String computerhouseLesson);

}
