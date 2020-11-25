//4)EmpServiceImpl(구현클래스) - 기능구현

package db2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class EmpServiceImpl implements EmpService {
	
	EmpDAO dao = new EmpDAO(); //EmpDAO를 가져와서 쓰려고 인스턴스를 만들고 변수 설정

	@Override
	public List getEmpList() {
		
		
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO vo) {
		dao.insertEmp(vo);
		
	}

	@Override
	public void updateEmp(EmployeeVO empVo) {
		dao.updateEmp(empVo);
		
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
		
	}

}
