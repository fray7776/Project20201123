package Interface;

public class Audio implements RemoteControl { //RemoteControl가 가지고 있는 interface를 구현

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	} 
	

}
