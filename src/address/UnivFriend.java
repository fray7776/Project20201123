package address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend(String name, String phone) {
		super(name, phone); //왜 uviv와 major의 생성자가 필요없는가??
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름: " + super.getName()+ ", 연락처: "+ super.getPhone() + "학교: "+this.univ+"전공: "+this.major);
	}

//	@Override
//	public void setPhone(String phone) {
//		super.setPhone(phone);
//		if (super.getPhone().equals(phone))
//		System.out.println("이름: " + super.getName()+ ", 연락처: "+ super.getPhone() + "학교: "+this.univ+"전공: "+this.major);
	}

	

//}
