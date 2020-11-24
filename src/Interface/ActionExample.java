package Interface;

public class ActionExample { //꼭 클래스가 필요한건 아니다.
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");

			}

		};

		action.work();//복사 
		
		action = new Action() {

			@Override
			public void work() {
				System.out.println("운전을 합니다.");
				
			}
			
		};
		action.work();//운전
	}

}
