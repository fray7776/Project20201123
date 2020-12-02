package com.yedam.interfaces;

interface Runnable {
	public void run();

}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행");
	}

}

class NewRun implements Runnable {

	@Override
	public void run() {
		System.out.println("새로운실행");
	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun(); // 구현클래스의 생성자로 호출
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() { // Runnable은 인터페이스이기 때문에 {}를 넣어서 익명구현객체를 실행할 수 있다.
			@Override
			public void run() {
				System.out.println("익명실행");
			}

		};
		runnable.run(); // 람다표현식으로 위에꺼를 지금과 같이 간단하게 표현할 수 있다.
		                // Runnable이라는 인터페이스를 익명의 구현객체 구현한다는 전제하에... 쓸 수 있음

		runnable = () -> System.out.println("또다른 익명실행");
		;
		runnable.run();

	}
}
