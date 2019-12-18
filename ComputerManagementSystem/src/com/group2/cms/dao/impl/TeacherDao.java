package com.group2.cms.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.group2.cms.dao.ITeacherDao;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.util.C3P0Util;

/**
 * 教师数据访问的实现类
 * @author 曾远洋
 * @time 2019年12月15日下午2:25:22
 * @version V1.0
 */
public class TeacherDao implements ITeacherDao {

	@Override
	public int insertTeacher(Teacher teacher) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("INSERT INTO teachermsg VALUES(?,?,?,?,?,?,?,?,?,?,?)", teacher.getTeacherId(),teacher.getTeacherNo(),
				teacher.getTeacherName(),teacher.getTeacherPwd(),teacher.getTeacherSex(),teacher.getTeacherBirthday(),teacher.getTeacherSeniority(),
				teacher.getTeacherTitle(),teacher.getTeacherPhone(),teacher.getTeacherEmail(),teacher.getTeacherRemarks());
	}

	@Override
	public int updateTeacherById(Teacher teacher) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("UPDATE teachermsg SET teacherNo = ?,teacherName = ?,teacherPwd = ?,teacherSex = ?,teacherBirthday = ?,teacherSeniority = ?,"
				+ "teacherTitle = ?,teacherPhone = ?,teacherEmail = ?,teacherRemarks = ? WHERE teacherId = ?", teacher.getTeacherNo(),
				teacher.getTeacherName(),teacher.getTeacherPwd(),teacher.getTeacherSex(),teacher.getTeacherBirthday(),teacher.getTeacherSeniority(),
				teacher.getTeacherTitle(),teacher.getTeacherPhone(),teacher.getTeacherEmail(),teacher.getTeacherRemarks(),teacher.getTeacherId());
	}

	@Override
	public Teacher selectTeacherById(Teacher teacher) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM teachermsg WHERE teacherId = ?", new BeanHandler<Teacher>(Teacher.class), teacher.getTeacherId());
	}

	@Override
	public Teacher selectTeacherByNameAndPwd(String teacherName, String teacherPwd) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM teachermsg WHERE teacherName = ? AND teacherPwd = ?", new BeanHandler<Teacher>(Teacher.class),teacherName,teacherPwd);
	}

	@Override
	public List<Teacher> selectAllTeacher() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM teachermsg", new BeanListHandler<Teacher>(Teacher.class));
	}

	@Override
	public Teacher selectTeacherByNo(String teahcerNo) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("SELECT * FROM teachermsg WHERE teacherNo = ? ", new BeanHandler<Teacher>(Teacher.class), teahcerNo);
	}

}
