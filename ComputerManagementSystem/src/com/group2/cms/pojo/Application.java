package com.group2.cms.pojo;

/**
 * 教师申请实体类
 * @author 曾远洋
 * @time 2019年12月16日下午5:04:47
 * @version V1.0
 */
public class Application {
	private String applicationId;
	private int applicationState;
	private String applicationTime;
	private String applicationReply;
	private String computerhouseNo;
	private String teacherNo;
	private String courseNo;
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public int getApplicationState() {
		return applicationState;
	}
	public void setApplicationState(int applicationState) {
		this.applicationState = applicationState;
	}
	public String getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}
	public String getApplicationReply() {
		return applicationReply;
	}
	public void setApplicationReply(String applicationReply) {
		this.applicationReply = applicationReply;
	}
	public String getComputerhouseNo() {
		return computerhouseNo;
	}
	public void setComputerhouseNo(String computerhouseNo) {
		this.computerhouseNo = computerhouseNo;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationState=" + applicationState
				+ ", applicationTime=" + applicationTime + ", applicationReply=" + applicationReply
				+ ", computerhouseNo=" + computerhouseNo + ", teacherNo=" + teacherNo + ", courseNo=" + courseNo + "]";
	}
	
}
