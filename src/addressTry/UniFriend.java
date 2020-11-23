package addressTry;

public class UniFriend extends Friend {
	
	private String uni;
	private String major;

	public UniFriend(String name, String phone) {
		super(name, phone);
		
	}

	public String getuni() {
		return uni;
	}

	public void setuni(String uni) {
		this.uni = uni;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void showFriendInfo() {
		System.out.println("이름: "+ super.getName() + " 전번: " + super.getPhone() + " 학교"+this.uni+ " 전공 "+this.major);
	}

}
