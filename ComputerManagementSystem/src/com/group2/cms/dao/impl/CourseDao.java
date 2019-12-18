package com.group2.cms.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.group2.cms.dao.ICourseDao;
import com.group2.cms.pojo.Course;
import com.group2.cms.util.C3P0Util;

/**
 * 课程的数据访问层实现类
 * @author 曾远洋
 * @time 2019年12月16日上午1:14:33
 * @version V1.0
 */
public class CourseDao implements ICourseDao {

	@Override
	public Course selectCourseByNo(String courseNo) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM coursemsg WHERE courseNo = ?", new BeanHandler<Course>(Course.class), courseNo);
	}
	
}
