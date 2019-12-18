package com.group2.cms.service;

import com.group2.cms.pojo.Teacher;

/**
 * 教师业务层接口
 * @author 曾远洋
 * @time 2019年12月15日下午3:29:22
 * @version V1.0
 */
public interface ITeacherService {

	/**
	 * 验证教师是否存在
	 * @param teacherName	教师名
	 * @param teacherPwd	教师密码
	 * @return	教师对象
	 */
	public Teacher searchTeacher(String teacherName, String teacherPwd);

	/**
	 * 修改教师数据
	 * @param teacher
	 * @return
	 */
	public int changeTeacherMsg(Teacher teacher);

}
