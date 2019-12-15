package com.group2.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师实体类
 * @author 曾远洋
 * @time 2019年12月15日下午1:49:52
 * @version V1.0
 */
public class Teacher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String teacherId;
	private String teacherNo;
	private String teacherName;
	private String teacherPwd;
	private String teacherSex;
	private Date teacherBirthday;
	private Integer teacherSeniority;
	private String teacherTitle;
	private String teacherPhone;
	private String teacherEmail;
	private String teacherRemarks;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
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
	public String getTeacherPwd() {
		return teacherPwd;
	}
	public void setTeacherPwd(String teacherPwd) {
		this.teacherPwd = teacherPwd;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public Date getTeacherBirthday() {
		return teacherBirthday;
	}
	public void setTeacherBirthday(Date teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}
	public Integer getTeacherSeniority() {
		return teacherSeniority;
	}
	public void setTeacherSeniority(Integer teacherSeniority) {
		this.teacherSeniority = teacherSeniority;
	}
	public String getTeacherTitle() {
		return teacherTitle;
	}
	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherRemarks() {
		return teacherRemarks;
	}
	public void setTeacherRemarks(String teacherRemarks) {
		this.teacherRemarks = teacherRemarks;
	}
	public Teacher(String teacherNo, String teacherName, String teacherPwd, String teacherSex,
			Integer teacherSeniority, String teacherTitle, String teacherPhone, String teacherEmail,
			String teacherRemarks) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.teacherPwd = teacherPwd;
		this.teacherSex = teacherSex;
		this.teacherSeniority = teacherSeniority;
		this.teacherTitle = teacherTitle;
		this.teacherPhone = teacherPhone;
		this.teacherEmail = teacherEmail;
		this.teacherRemarks = teacherRemarks;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherNo=" + teacherNo + ", teacherName=" + teacherName
				+ ", teacherPwd=" + teacherPwd + ", teacherSex=" + teacherSex + ", teacherBirthday=" + teacherBirthday
				+ ", teacherSeniority=" + teacherSeniority + ", teacherTitle=" + teacherTitle + ", teacherPhone="
				+ teacherPhone + ", teacherEmail=" + teacherEmail + ", teacherRemarks=" + teacherRemarks + "]";
	}
	
}
