package com.yedam.inheritance;

public class NewChild extends Parent {
	String field3;

	public NewChild(String f1, String f2, String f3) {
		super(f1);
		this.field3 = f3;
	}

	public NewChild(String e1, String e2) {
		super(e1);
		this.field3 = e1;
	}

	public void method3() {
		System.out.println("method3() 호출");
	}

}
