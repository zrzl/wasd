package com.shsxt.query;

public class UserQuery {
	private Integer id;
	private String userName;
	private String userPwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "UserQuery [id=" + id + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}
	
	

}
