package com.group2.cms.pojo;

/**
 * 课程实体类
 * @author 曾远洋
 * @time 2019年12月16日上午1:10:02
 * @version V1.0
 */
public class Course {
	private String courseId;
	private String courseNo;
	private String courseName;
	private String courseMajor;
	private Teacher teacher;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
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
	public String getCourseMajor() {
		return courseMajor;
	}
	public void setCourseMajor(String courseMajor) {
		this.courseMajor = courseMajor;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course(String courseId, String courseNo, String courseName, String courseMajor, Teacher teacher) {
		super();
		this.courseId = courseId;
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.courseMajor = courseMajor;
		this.teacher = teacher;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseNo=" + courseNo + ", courseName=" + courseName
				+ ", courseMajor=" + courseMajor + ", teacher=" + teacher + "]";
	}
	
}
