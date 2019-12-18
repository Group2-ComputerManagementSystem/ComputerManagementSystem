package com.group2.cms.pojo;
  //用户实体类
public class User {
	private String userID;
	private String userName;
	private String userPwd;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public User(String userID, String userName, String userPwd) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
	

}
