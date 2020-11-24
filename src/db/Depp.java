package db;

public class Depp {
	private String departmentsId;
	private String departmentName;
	private String ManagerId;
	private String LocationID;

	public String getDepartmentsId() {
		return departmentsId;
	}

	public void setDepartmentsId(String departmentsId) {
		this.departmentsId = departmentsId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getManagerId() {
		return ManagerId;
	}

	public void setManagerId(String managerId) {
		ManagerId = managerId;
	}

	public String getLocationID() {
		return LocationID;
	}

	public void setLocationID(String locationID) {
		LocationID = locationID;
	}

	public void showdeppInfo() {
		System.out.println(
				"부서번호: " + departmentsId + "부서 이름: " + departmentName + "사수 아이디: " + ManagerId + "위치 정보" + LocationID);

	}
}
