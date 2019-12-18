package com.group2.cms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.group2.cms.dao.IApplicationDao;
import com.group2.cms.pojo.Application;
import com.group2.cms.pojo.Application_Flag;
import com.group2.cms.util.C3P0Util;

/**
 * 教师申请数据访问层接口的实现类
 * @author 曾远洋
 * @time 2019年12月16日下午5:09:51
 * @version V1.0
 */
public class ApplicationDao implements IApplicationDao {

	@Override
	public int insertApplication(Application application) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("INSERT INTO applicationmsg VALUES(?,?,?,?,?,?,?)", application.getApplicationId(),application.getApplicationState(),application.getApplicationTime(),application.getApplicationReply(),
				application.getComputerhouseNo(),application.getTeacherNo(),application.getCourseNo());
	}

	@Override
	public List<Application> selectMyApplication(String teacherNo) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM applicationmsg WHERE teacherNo = ?", new BeanListHandler<Application>(Application.class), teacherNo);
	}

	@Override
	public int deleteApplicationById(String applicationId) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("DELETE FROM applicationmsg WHERE applicationId = ?", applicationId);
	}

	@Override
	public List<Application> selectApplicationByTeacherNoAndState(String teacherNo, int applicationState)
			throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM applicationmsg WHERE teacherNo = ? AND applicationState = ?", new BeanListHandler<Application>(Application.class), teacherNo,applicationState);
	}

	@Override
	public List<Application_Flag> selectMyPassApplicationByCondition(String courseName, String courseNo,
			String computerhouseNo, String teacherNo) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		StringBuffer sb = new StringBuffer("SELECT DISTINCT applicationId,applicationState,applicationTime,applicationReply,computerhousemsg.`computerhouseNo`,computerhousemsg.`computerhouseName`,teachermsg.`teacherNo`,teachermsg.`teacherName`,coursemsg.`courseNo`,coursemsg.`courseName` "
				+ "FROM applicationmsg,coursemsg,teachermsg,computerhousemsg WHERE applicationmsg.`computerhouseNo` = computerhousemsg.`computerhouseNo` "
				+ "AND applicationmsg.`courseNo` = coursemsg.`courseNo` AND applicationmsg.`teacherNo` = teachermsg.`teacherNo` AND applicationState=1 ");
		if(courseName != null && !"".equals(courseName)) {
			sb = sb.append(" AND courseName = '" + courseName + "' ");
		}
		if(courseNo != null && !"".equals(courseNo)) {
			sb = sb.append(" AND applicationmsg.`courseNo` = " + courseNo);
		}
		if(computerhouseNo != null && !"".equals(computerhouseNo)) {
			sb = sb.append(" AND applicationmsg.`computerhouseNo` = " + computerhouseNo);
		}
		if(teacherNo != null && !"".equals(teacherNo)) {
			sb = sb.append(" AND applicationmsg.`teacherNo` = " + teacherNo);
		}
		String sql = sb.toString();
		return queryRunner.query(sql, new BeanListHandler<Application_Flag>(Application_Flag.class));
	}

}
