package abstracts;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone(); //Phone은 부모클래스라 smartphone담을 수 있음
		phone.owner="Hong";
		phone.turnOn();
				
//		new Phone();
//		new Phone("Hong");
	}

}
