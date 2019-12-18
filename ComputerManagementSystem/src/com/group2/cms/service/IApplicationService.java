package com.group2.cms.service;

import java.util.List;

import com.group2.cms.pojo.Application;
import com.group2.cms.pojo.Application_Flag;

/**
 * 教师申请业务层接口
 * @author 曾远洋
 * @time 2019年12月16日下午5:12:03
 * @version V1.0
 */
public interface IApplicationService {

	/**
	 * 创建教师申请
	 * @param application
	 * @return
	 */
	public int creatApplication(Application application);

	/**
	 * 根据我的教师号查询我的所有申请
	 * @param teacherNo
	 * @return
	 */
	public List<Application_Flag> searchMyAppliction(String teacherNo);

	/**
	 * 移出教师申请
	 * @param applicationId
	 * @return
	 */
	public int removeAppliction(String applicationId);
	
	/**
	 * 查询通过的我的申请
	 * @param teacherNo
	 * @return
	 */
	public List<Application_Flag> searchMyPassApplication(String teacherNo);
	
	/**
	 * 多条件查询我的通过的申请
	 * @param courseName
	 * @param courseNo
	 * @param computerhouseNo
	 * @return
	 */
	public List<Application_Flag> searchMyPassApplicationByCondition(String courseName, String courseNo,
			String computerhouseNo,String teacherNo);

}
