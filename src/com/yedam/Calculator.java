package com.yedam;

public class Calculator {
	private String color;
	static double pi=3.14;
	public void setColor(String color) {
		this.color = color;
	}
	public static int plus(int a, int b) {
		//static이 붙으면 인스턴스 안만들고 바로 붙여 쓸수 있음
		//메모리에 올라와 있어 바로 불러 쓸수 있음
		//Calculator.plus(a,b)
		return a+b;
	}
	public static int minus(int a,int b) {
		return a-b;
	}

}
