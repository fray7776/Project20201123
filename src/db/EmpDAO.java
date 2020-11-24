package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = getConnection();
	
	public void insertEmployee(Employee emp) {
		String sql = "insert into emp1(last_name, email,job_id,hire_date)"
		+"values(?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.geteMail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate(); //insert, update, delete
			System.out.println(r+"건이 입력됨");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public Employee[] getEmpList() { //select * from emp1을 배열에 담아 보여주는 실습
		String sql = "select * from emp1"; 
		Employee[] emps = new Employee[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.seteMail(rs.getString("eMail"));
				emp.setPhoneNumber(rs.getString("phone_Number"));
				emp.setHireDate(rs.getString("hire_Date"));
				emp.setJobId(rs.getString("job_Id"));
				emp.setSalary(rs.getInt("salary"));
				emps[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emps;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try { // try catch는 예외상황이 발행할때 구문이 나오게 하는함수
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // xe(database 아이디)

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

}