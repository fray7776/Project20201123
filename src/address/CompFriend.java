package address;

public class CompFriend extends Friend {
	private String company;
	private String department;
	public CompFriend(String name, String phone) {
		super(name,phone); //부모클래스 생성자 호출
		
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
	@Override
	public void showFriendInfo() {
//		super.showFriendInfo(); 
		System.out.println("이름: " + super.getName()+ ", 연락처: "+ super.getPhone() + "부서: "+this.company+"회사: "+this.department); 
		//Override=>재정의해서 부모클래스방식 말고 다시 정의하겠다. getName & getPhone은 접근이 가능해서 부모클래스가 private일떄 사용가능
	}
	

}
