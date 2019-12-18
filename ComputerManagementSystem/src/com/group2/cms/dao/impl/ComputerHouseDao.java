package com.group2.cms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.group2.cms.dao.IComputerHouseDao;
import com.group2.cms.pojo.ComputerHouse;
import com.group2.cms.pojo.ComputerHouse_Flag;
import com.group2.cms.util.C3P0Util;

/**
 * 机房数据访问层实现类
 * @author 曾远洋
 * @time 2019年12月16日上午10:46:06
 * @version V1.0
 */
public class ComputerHouseDao implements IComputerHouseDao {

	@Override
	public List<ComputerHouse_Flag> selectAllComputerHouse() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT DISTINCT computerhouseNo,computerhouseName,computerhouseSize FROM computerhousemsg", new BeanListHandler<ComputerHouse_Flag>(ComputerHouse_Flag.class));
	}

	@Override
	public List<ComputerHouse> selectComputerHouseByCondition(String startWeek, String endWeek, String computerhouseDay,
			String computerhouseLesson) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		StringBuffer sb = new StringBuffer("SELECT * FROM computerhousemsg WHERE 1=1 ");
		if(startWeek != null && !"".equals(startWeek) && endWeek != null && !"".equals(endWeek) && Integer.parseInt(endWeek) >= Integer.parseInt(startWeek)) {
			sb = sb.append(" AND computerhouseWeek >= " + startWeek + " AND computerhouseWeek <= " + endWeek);
		}
		if(computerhouseDay != null && !"".equals(computerhouseDay)) {
			sb = sb.append(" AND computerhouseDay = " + computerhouseDay);
		}
		if(computerhouseLesson != null && !"".equals(computerhouseLesson)) {
			sb = sb.append(" AND computerhouseLesson = " + computerhouseLesson);
		}
		sb = sb.append(" AND courseId = 0 GROUP by computerhouseNo ,computerhouseName,computerhouseSize");
		String sql = sb.toString();
		return queryRunner.query(sql, new BeanListHandler<ComputerHouse>(ComputerHouse.class));
	}

	@Override
	public ComputerHouse_Flag selectComputerHouseByNo(String computerhouseNo) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT DISTINCT computerhouseNo,computerhouseName,computerhouseSize FROM computerhousemsg WHERE computerhouseNo = ?", new BeanHandler<ComputerHouse_Flag>(ComputerHouse_Flag.class), computerhouseNo);
	}


}
