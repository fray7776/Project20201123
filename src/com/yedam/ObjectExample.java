package com.yedam;

import java.lang.System; //system out을 할때 java.lang.밑에 있는 system을 import안해도 쓸수 있음. 
                         //패키지가 달라도 오라클이 가능하도록... 했음

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Object o1 = new Object();
		boolean sameOrDiff = o1.equals("Hello");
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString());
		
		
	}

}
