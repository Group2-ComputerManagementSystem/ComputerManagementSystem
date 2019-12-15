package com.group2.cms.service.impl;

import java.sql.SQLException;

import com.group2.cms.dao.ITeacherDao;
import com.group2.cms.dao.impl.TeacherDao;
import com.group2.cms.pojo.Teacher;
import com.group2.cms.service.ITeacherService;

public class TeacherService implements ITeacherService {

	@Override
	public Teacher searchTeacher(String teacherName, String teacherPwd) {
		ITeacherDao teacherDao = new TeacherDao();
		try {
			return teacherDao.selectTeacherByNameAndPwd(teacherName, teacherPwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
