package com.czb.enums;

public enum SexEnum {
	MAN("男",0),WOMAN("女",1);
	
	private String name;
	private int index;
	
	private SexEnum(String name,int index){
		this.name = name;
		this.index = index;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
