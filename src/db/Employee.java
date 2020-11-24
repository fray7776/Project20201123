package db;

public class Employee {
	private int employeeId; //자바에서는 두단어의 조합을 대소문자로 구분
	private String firstName;
	private String lastName;
	private String eMail;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;
	
	//생성자 : lastName, email, jobId, hireDate
	
	public Employee() {}
	
	public Employee(String lastName, String eMail, String hireDate, String jobId) {
		super();
		this.lastName = lastName;
		this.eMail = eMail;
		this.hireDate = hireDate;
		this.jobId = jobId;
		

	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void showEmpInfo() {
		System.out.println("사원번호: "+employeeId+" 성: "+firstName+" 이름: "+lastName
		+" 이메일: "+eMail+"폰 번호: "+phoneNumber+" 입사일 : "+hireDate+" 부서: "+jobId+" 급여: "+salary);
	}
	

}
