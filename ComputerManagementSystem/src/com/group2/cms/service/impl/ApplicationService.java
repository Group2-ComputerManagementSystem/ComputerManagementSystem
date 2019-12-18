package com.group2.cms.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.group2.cms.dao.IApplicationDao;
import com.group2.cms.dao.IComputerHouseDao;
import com.group2.cms.dao.ICourseDao;
import com.group2.cms.dao.ITeacherDao;
import com.group2.cms.dao.impl.ApplicationDao;
import com.group2.cms.dao.impl.ComputerHouseDao;
import com.group2.cms.dao.impl.CourseDao;
import com.group2.cms.dao.impl.TeacherDao;
import com.group2.cms.pojo.Application;
import com.group2.cms.pojo.Application_Flag;
import com.group2.cms.service.IApplicationService;

/**
 * 教师申请业务层接口的实现
 * @author 曾远洋
 * @time 2019年12月16日下午5:12:49
 * @version V1.0
 */
public class ApplicationService implements IApplicationService {
	IApplicationDao applicationDao = new ApplicationDao();

	@Override
	public int creatApplication(Application application) {
		try {
			return applicationDao.insertApplication(application);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Application_Flag> searchMyAppliction(String teacherNo) {
		ITeacherDao teacherDao = new TeacherDao();
		IComputerHouseDao computerHouseDao = new ComputerHouseDao();
		ICourseDao courseDao = new CourseDao();
		try {
			List<Application> appList = applicationDao.selectMyApplication(teacherNo);
			List<Application_Flag> appFlagList = new ArrayList<Application_Flag>();
			for (Application application : appList) {
				Application_Flag app = new Application_Flag();
				app.setApplicationId(application.getApplicationId());
				app.setApplicationReply(application.getApplicationReply());
				String state = "";
				if(application.getApplicationState() == 0) {
					state = "未审核";
				}else if(application.getApplicationState() == 1) {
					state = "审核通过";
				}else if(application.getApplicationState() == -1) {
					state = "审核未通过";
				}
				app.setApplicationState(state);
				String[] timeArray = application.getApplicationTime().split("-");
				String time = "第" + timeArray[0] + "周到第" + timeArray[1] + "周，星期" + timeArray[2] + "第" + timeArray[3] + "节";
				app.setApplicationTime(time);
				app.setComputerhouseNo(application.getComputerhouseNo());
				app.setComputerhouseName(computerHouseDao.selectComputerHouseByNo(application.getComputerhouseNo()).getComputerhouseName());
				app.setCourseNo(application.getCourseNo());
				app.setCourseName(courseDao.selectCourseByNo(application.getCourseNo()).getCourseName());
				app.setTeacherNo(application.getTeacherNo());
				app.setTeacherName(teacherDao.selectTeacherByNo(application.getTeacherNo()).getTeacherName());
				appFlagList.add(app);
			}
			return appFlagList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int removeAppliction(String applicationId) {
		try {
			return applicationDao.deleteApplicationById(applicationId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Application_Flag> searchMyPassApplication(String teacherNo) {
		List<Application_Flag> applist = searchMyAppliction(teacherNo);
		List<Application_Flag> list = new ArrayList<Application_Flag>();
		if(applist != null) {
			for (Application_Flag application_Flag : applist) {
				if("审核通过".equals(application_Flag.getApplicationState())) {
					list.add(application_Flag);
				}
			}
			return list;
		}else {
			
			return null;
		}
	}

	@Override
	public List<Application_Flag> searchMyPassApplicationByCondition(String courseName, String courseNo,
			String computerhouseNo, String teacherNo) {
		try {
			List<Application_Flag> applist = applicationDao.selectMyPassApplicationByCondition(courseName,courseNo,computerhouseNo,teacherNo);
			for (Application_Flag application_Flag : applist) {
				String[] timeArray = application_Flag.getApplicationTime().split("-");
				String time = "第" + timeArray[0] + "周到第" + timeArray[1] + "周，星期" + timeArray[2] + "第" + timeArray[3] + "节";
				application_Flag.setApplicationTime(time);
			}
			return applist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
