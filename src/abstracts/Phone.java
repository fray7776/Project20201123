package abstracts;


public abstract class Phone {
	public String owner;

	public Phone() {
	}

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");

	}

	public abstract void ring(); 
	public abstract void turnOff(); 

}
