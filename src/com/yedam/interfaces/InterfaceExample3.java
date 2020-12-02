package com.yedam.interfaces;

interface MyfunctionalInterface {
	public void run(int radius);
}

interface Myfunctional {
	public void aa(int num1, int num2);
}

interface Myfun {
	public void bb(int num1, int num2);
}


public class InterfaceExample3 {
	public static void main(String[] args) {
		//1.화면출력(원의 넓이를 구하는.... 기능 구현)
		MyfunctionalInterface mf = (int num) -> {
			System.out.println(num*num*3.14);
		};
		mf.run(2);
		
		
				
		//2.화면출력(밑변으로 가지는 삼각형의 넓이 구하는 기능 구현)
		
		Myfunctional mt = (a, b) -> {
			System.out.println(a*b/2);
		};
		mt.aa(3, 3);
		
		//3.화면출력(정사각형의 넓이를 구하는 기능 구현)
		Myfun mmf = (a,b) -> {
			System.out.println(a*b);
		};
		mmf.bb(5, 5);
	}
	

}
