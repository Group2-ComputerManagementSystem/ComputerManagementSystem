package com.group2.cms.test;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.group2.cms.dao.ITeacherDao;
import com.group2.cms.dao.impl.TeacherDao;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.util.UUIDUtil;

public class ProjectTest {

	@Test
	public void insertTeacher() {
		ITeacherDao teacherDao = new TeacherDao();
		Teacher teacher = new Teacher("20150203109", "曾远洋", "zyy520", "男", 2, "教授", "15608176105", "531857704@qq.com", "长得帅");
		teacher.setTeacherId(UUIDUtil.getUUID());
		try {
			Date date = DateUtils.parseDate("1996-08-20", new String[] {"yyyy-MM-dd"});
			teacher.setTeacherBirthday(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			teacherDao.insertTeacher(teacher);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
