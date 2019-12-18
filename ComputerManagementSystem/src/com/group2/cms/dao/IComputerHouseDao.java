package com.group2.cms.dao;

import java.sql.SQLException;
import java.util.List;

import com.group2.cms.pojo.ComputerHouse;
import com.group2.cms.pojo.ComputerHouse_Flag;

/**
 * 机房数据访问层
 * @author 曾远洋
 * @time 2019年12月16日上午10:45:06
 * @version V1.0
 */
public interface IComputerHouseDao {
	/**
	 * 查询所有机房
	 * @return
	 */
	public List<ComputerHouse_Flag> selectAllComputerHouse() throws SQLException;
	/**
	 * 多条件查询机房
	 * @param startWeek
	 * @param endWeek
	 * @param computerhouseDay
	 * @param computerhouseLesson
	 * @return
	 * @throws SQLException 
	 */
	public List<ComputerHouse> selectComputerHouseByCondition(String startWeek,String endWeek,String computerhouseDay,String computerhouseLesson) throws SQLException;
	/**
	 * 根据机房号查询机房
	 * @param computerhouseNo
	 * @return
	 * @throws SQLException
	 */
	public ComputerHouse_Flag selectComputerHouseByNo(String computerhouseNo) throws SQLException;

}
