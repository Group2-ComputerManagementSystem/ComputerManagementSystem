package com.group2.cms.pojo;

/**
 * 临时类
 * @author 曾远洋
 * @time 2019年12月16日下午7:17:23
 * @version V1.0
 */
public class Application_Flag {
	private String applicationId;
	private String applicationState;
	private String applicationTime;
	private String applicationReply;
	private String computerhouseNo;
	private String computerhouseName;
	private String teacherNo;
	private String teacherName;
	private String courseNo;
	private String courseName;
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationState() {
		return applicationState;
	}
	public void setApplicationState(String applicationState) {
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
	public String getComputerhouseName() {
		return computerhouseName;
	}
	public void setComputerhouseName(String computerhouseName) {
		this.computerhouseName = computerhouseName;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Application_Flag [applicationId=" + applicationId + ", applicationState=" + applicationState
				+ ", applicationTime=" + applicationTime + ", applicationReply=" + applicationReply
				+ ", computerhouseNo=" + computerhouseNo + ", computerhouseName=" + computerhouseName + ", teacherNo="
				+ teacherNo + ", teacherName=" + teacherName + ", courseNo=" + courseNo + ", courseName=" + courseName
				+ "]";
	}
	
}
