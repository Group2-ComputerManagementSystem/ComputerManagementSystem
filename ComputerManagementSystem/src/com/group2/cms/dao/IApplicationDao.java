package com.group2.cms.dao;

import java.sql.SQLException;
import java.util.List;

import com.group2.cms.pojo.Application;
import com.group2.cms.pojo.Application_Flag;

/**
 * 教师申请数据访问层接口
 * @author 曾远洋
 * @time 2019年12月16日下午5:09:04
 * @version V1.0
 */
public interface IApplicationDao {
	/**
	 * 插入一条申请
	 * @param application
	 * @return
	 */
	public int insertApplication(Application application) throws SQLException;
	
	/**
	 * 根据教师号查询申请
	 * @param teacherNo
	 * @return
	 * @throws SQLException
	 */
	public List<Application> selectMyApplication(String teacherNo) throws SQLException;
	/**
	 * 根据申请编号删除申请
	 * @param applicationId
	 * @return
	 * @throws SQLException
	 */
	public int deleteApplicationById(String applicationId) throws SQLException;
	/**
	 * 根据教师号和状态查询申请
	 * @param teacherNo
	 * @param applicationState
	 * @return
	 * @throws SQLException
	 */
	public List<Application> selectApplicationByTeacherNoAndState(String teacherNo,int applicationState) throws SQLException;

	/**
	 * 多条件查询申请数据
	 * @param courseName
	 * @param courseNo
	 * @param computerhouseNo
	 * @param teacherNo
	 * @return
	 * @throws SQLException
	 */
	public List<Application_Flag> selectMyPassApplicationByCondition(String courseName, String courseNo,
			String computerhouseNo, String teacherNo) throws SQLException;
}
