package addressTry;

public class Friend {

	private String name;
	private String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void showFriendInfo() {
		System.out.println("이름: " + this.name + " 전번: " + this.phone);

	}
}