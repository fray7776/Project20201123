//common > DAO에서 connection가져오기
//처리기능 만들기> 전체조회, 한건조회, 한건입력, 한건수정, 한건삭제
package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import common.DAO;

public class EmpDAO { // 아래 네가지는 필드로 선언, 계속 쓸거니까
	Connection conn = DAO.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.seteMail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return list;
		}
		return list;
	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		sql = "select * from emp1 where employee_Id=?";
		conn = DAO.getConnection();
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_Id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.seteMail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		sql = "insert into emp1(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary)"
				+ "values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getFirstName());
			pstmt.setString(3, vo.getLastName());
			pstmt.setString(4, vo.geteMail());
			pstmt.setString(5, vo.getPhoneNumber());
			pstmt.setString(6, vo.getHireDate());
			pstmt.setString(7, vo.getJobId());
			pstmt.setInt(8, vo.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) {
			sql = "update emp1" + " set email =nvl('" + vo.geteMail() + "',email)" + "   ,phone_number =nvl('"
					+ vo.getPhoneNumber() + "',phone_number)" + "   ,salary =nvl(" + vo.getSalary() + ",salary"
					+ " where employee_id =" + vo.getEmployeeId();
		} else {
			sql = "update emp1" + " set email =nvl('" + vo.geteMail() + "',email)" + "   ,phone_number =nvl('"
					+ vo.getPhoneNumber() + "',phone_number)" + "   ,salary =nvl(" + vo.getSalary() + ",salary"
					+ " where employee_id =" + vo.getEmployeeId();
		}
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate(); // 위의 쿼리의 실행결과를 반환
			System.out.println(r + "건이 수정됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); //윈도우>서비스>OracleXETNListener에서 다시시작! or 할때마다 닫기
			}catch (SQLException e) { //conn.close도 파일을 생성하거나 닫을때 예외처리 하도록 되있어서 catch를 또사용..
				e.printStackTrace();
			}
		}

	}

	// 한건삭제
	public void deleteEmp(int empId) {

		sql = "delete from emp1 where employee_id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId); // PreparedStatement의 변수인 pstmt(1,empId)는
									// sql문장의 ?에 첫번째자리에 empId를 넣는다는말.
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제됨");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//부서별 조회
	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "SELECT* FROM emp1\r\n"
				+ "WHERE department_id = (SELECT department_id FROM departments WHERE department_name='"+dept+"')";
		//'"+dept+"' 이거를 변수로 처리해줘서 앞의 sql 쿼리랑 이어주기 위해 +사용
		List<EmployeeVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.seteMail(rs.getString("email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return list;
		}
		return list;
	}

		
	 
}