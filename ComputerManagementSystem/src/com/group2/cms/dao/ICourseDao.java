package com.group2.cms.dao;

import java.sql.SQLException;

import com.group2.cms.pojo.Course;

/**
 * 课程数据访问层接口
 * @author 曾远洋
 * @time 2019年12月16日上午1:13:48
 * @version V1.0
 */
public interface ICourseDao {
	/**
	 * 根据课程号查询课程
	 * @param courseNo
	 * @return
	 * @throws SQLException
	 */
	public Course selectCourseByNo(String courseNo) throws SQLException;

}
