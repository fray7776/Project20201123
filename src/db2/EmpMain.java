//5가지 기능 : 조회, 한건조회, 입력, 수정, 삭제
//인터페이스 : 기능정의
//구현객체: 기능구현
//테이블 : emp1
//1) EmployeeVO 활용
//2)EmpDAO(DB에서 쿼리실행)
//3)EmpService(인터페이스) - 기능정의
//4)EmpServiceImpl(구현클래스)
//5)EmpMain(실행클래스)
//ArrayList method> 추가: add() 삭제:remove() 한건 가지고 오기 : get()

package db2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.EmpDAO;

public class EmpMain {
	public static void main(String[] args) {
		// 1.전체조회 2.한건조회 3.입력 4.수정 5.삭제 를 EmpServicempl에 있는 기능을 구현
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (true) {
			
			System.out.println("=================================================");
            System.out.println("1.전체조회 | 2.검색 | 3.입력 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("=================================================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			if(selectNo ==1) {
				List list = service.getEmpList();
				for(Object vo : list) {
					EmployeeVO emp = (EmployeeVO)vo;
					emp.showEmpInfo();
				}
				
			}else if(selectNo ==2) {
				System.out.println("사원번호를 입력하세요~~");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();
				
			}else if(selectNo ==3) {
				System.out.println("사원 사원id를 입력하세요~~");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("사원 이름을 입력하세요~~");
				String firstName =scn.nextLine();
				System.out.println("사원 성을 입력하세요~~");
				String lastName =scn.nextLine();
				System.out.println("이메일을 입력하세요~~");
				String eMail =scn.nextLine();
				System.out.println("폰번호를 입력하세요~~");
				String phoneNumber =scn.nextLine();
				System.out.println("입사날짜를 입력하세요~~");
				String hireDate =scn.nextLine();
				System.out.println("부서id를 입력하세요~~");
				String jobId =scn.nextLine();
				System.out.println("급여를 입력하세요~~");
				int salary = scn.nextInt();
				EmployeeVO vo = new EmployeeVO(empId, firstName, lastName,
						eMail, phoneNumber,
						hireDate, jobId, salary);
				service.insertEmp(vo);
						
			}else if(selectNo ==4) {
				System.out.println("수정할 사원번호 입력하세요~~");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("수정할 이메일 입력하세요~~");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호 입력하세요~~");
				String PhoneNo = scn.nextLine();
				System.out.println("수정할 급여를 입력하세요~~");
				String salary = scn.nextLine();
				if(salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary);
				
				
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.seteMail(email);
				vo.setPhoneNumber(PhoneNo);
				vo.setSalary(sal);
				
				service.updateEmp(vo);
				
			}else if(selectNo ==5) {
				System.out.println("삭제할 사원id를 입력하시오");
				int empId = scn.nextInt();scn.nextLine();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();
				
				service.deleteEmp(empId);
				
			}else if(selectNo ==6) {
				break;
			}
		}
		System.out.println("프로그램 종료!!!!");

	}

}
