package com.yedam.interfaces;


interface Cal{ //인터페이스가 구현할 함수가 1밖에 없는경우>functional(함수적) interface.. 일때만 람다식 표현이 가능
	public void multi(int num); //함수 1
}

interface Calculate {
	public void sum(int num1, int num2); // 함수 1
}

public class InterfaceExample2 { //익명선언
	public static void main(String[] args) {
		Calculate calcu = (int num1, int num2) -> {
				System.out.println(num1 + num2);
		};
		calcu.sum(3, 5);
		
		calcu = (a, b)->{
			System.out.println(a*b);
		};
		calcu.sum(3, 5);
		
		Cal cal =  
			(num) -> {
				int result = num*2;
				System.out.println(result);
			};
		cal.multi(3);
		
		     cal =  
				(a) -> {
					int result = a*a;
					System.out.println(result);
				};
			cal.multi(3);
	}

}
