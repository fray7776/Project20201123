package com.yedam;

public class St {
	String name;
	String major;
	String uni;
	int id;
	
	
	public St() {
		
	}
	
	public St(String name,String major,String uni,int id) {
		this.name = name;
		this.major = major;
		this.uni = uni;
		this.id = id;
	}
	
	public St(String uni, int id) {
		this.uni=uni;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
