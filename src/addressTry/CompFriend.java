package addressTry;

public class CompFriend extends Friend {

	public String company;
	public String department;

	public CompFriend(String name, String phone) {
		super(name, phone);

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void showFriendInfo() {
		System.out.println("이름: " + super.getName() + " 전번: " + super.getPhone() + " 학교" + this.company + " 전공 "
				+ this.department);

	}
}