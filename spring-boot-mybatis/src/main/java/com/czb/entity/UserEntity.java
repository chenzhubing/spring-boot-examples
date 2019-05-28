package com.czb.entity;

import com.czb.enums.SexEnum;

public class UserEntity {
	
	private int id;
	private String nickName;
	private SexEnum sex;
	private String userName;
	
	
	@Override
	public String toString() {
		return "UserEntity [nickName=" + nickName + ", sex=" + sex
				+ ", userName=" + userName + "]";
	}
	
	
	public UserEntity(){
		
		
	}
	
	public UserEntity(String userName,String nickName,SexEnum sex) {
		super();
		this.nickName = nickName;
		this.sex = sex;
		this.userName = userName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
