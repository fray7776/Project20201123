package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("송혜원");
		s1.setMajor("English");
		s1.setUni("yedam");
		s1.setId(20-7555);
		s1.showStudentInfo();
		
		Student s2 = new Student();
		s2.setUni("yedam");
		s2.setId(20-7555);
		s2.showStudentInfo();
		
		Student s3 = new Student("송혜원","English","yedam",20-9999);
		s3.showStudentInfo();
		
		Student [] students = {s1,s2,s3};
		
		for(Student student : students) {
			if(("yedam").equals(student.getUni())) {
				student.showStudentInfo();
			}
		}
		

	}


}
