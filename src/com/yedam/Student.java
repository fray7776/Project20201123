package com.yedam;

public class Student {
	// 이름,전공,학번,학교

	String name;
	String major;
	String uni;
	int id;

	public Student() {
		
	}
	
	
	public Student(String name, String major, String uni, int id) {
		this.name = name;
		this.major = major;
		this.uni = uni;
		this.id = id;

	}

	public Student(String uni, int id) {
		this.uni = uni;
		this.id = id;
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
	
	public void showStudentInfo() {
		System.out.println(name+uni+id+major);
	}
   //학교만 출력
	
}
