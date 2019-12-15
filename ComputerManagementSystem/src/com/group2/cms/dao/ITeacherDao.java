package com.group2.cms.dao;

import java.sql.SQLException;

import com.group2.cms.pojo.Teacher;

/**
 * 教师数据访问层接口
 * @author 曾远洋
 * @time 2019年12月15日下午1:50:47
 * @version V1.0
 */
public interface ITeacherDao {
	/**
	 * 添加教师
	 * @param teacher	教师对象
	 * @return	受影响行数
	 * @throws SQLException
	 */
	public int insertTeacher(Teacher teacher) throws SQLException;
	/**
	 * 根据Id修改教师信息
	 * @param teacher	教师对象
	 * @return	受影响行数
	 * @throws SQLException
	 */
	public int updateTeacherById(Teacher teacher) throws SQLException;
	/**
	 * 根据Id查询教师
	 * @param teacherName	教师姓名
	 * @param teahcerPwd	教师密码
	 * @return	教师对象
	 * @throws SQLException
	 */
	public Teacher selectTeacherById(Teacher teacher) throws SQLException;
	/**
	 * 根据教师名和教师密码查询教师
	 * @param teacherName 教师姓名
	 * @param teacherPwd	教师密码
	 * @return	教师对象
	 * @throws SQLException
	 */
	public Teacher selectTeacherByNameAndPwd(String teacherName,String teacherPwd) throws SQLException;
}
