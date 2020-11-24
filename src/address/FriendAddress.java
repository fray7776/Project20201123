package address;

import java.util.Scanner;

public class FriendAddress { // class에 바로 선언되어지는 것은 필드!(friend배열을 class에 바로 쓰면 변수 > 필드가됨)
								// static을 쓰면 쓸 준비가 되어 있다는 뜻
	// 주소록 생성 프로그램

	static Friend[] friends = new Friend[100];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) { // 메소드 안에 선언되어지는 것은 변수!

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.친구정보 |6.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				searchFriend();
			} else if (selectNo == 6) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}// end of main

	// 1.친구등록
	public static void addFriend() {
		System.out.println("친구이름을 입력하세요!!");
		String name = scn.nextLine();
		System.out.println("전화번호 입력하세요!!");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
	}

	// 2.학교친구
	public static void addUnivFriend() {
		System.out.println("친구이름을 입력하세요!!");
		String name = scn.nextLine();
		System.out.println("전화번호 입력하세요!!");
		String phone = scn.nextLine();
		System.out.println("학교이름을 입력하세요!!");
		String univ = scn.nextLine();
		System.out.println("전공을 입력하세요!!");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
	}

	// 3.회사친구
	public static void addCompFriend() {
		System.out.println("친구이름을 입력하세요!!");
		String compname = scn.nextLine();
		System.out.println("전화번호 입력하세요!!");
		String compphone = scn.nextLine();
		System.out.println("회사이름을 입력하세요!!");
		String company = scn.nextLine();
		System.out.println("부서정보를 입력하세요!!");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(compname, compphone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFriend(frnd);
	}

	// 4.리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();

			}
		}

	}

	// 5.한 건 조회
	public static void searchFriend() {

		System.out.println("친구의 전화번호 입력해라");
		String phone = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (phone.equals(friends[i].getPhone())) {
				friends[i].showFriendInfo();
				break;

			}
		}
	}
// end of class
	// 6.함수

//		Friend f1 = new Friend ("친구1","11-1111");
//		CompFriend f2 = new CompFriend ("친구2","22-2222");
//		f2.setCompany("네이버 ");
//		f2.setDepartment("개발부서 ");
//		UnivFriend f3 = new UnivFriend("친구3","33-3333");
//		f3.setUniv("서울대학교 ");
//		f3.setMajor("컴퓨터정보 ");
//		
//		f1.showFriendInfo();
//		f2.showFriendInfo();
//		f3.showFriendInfo();

//메뉴 6번 연락처넣으면 showinfo 다 나오게 
	public static void insertFriend(Friend frnd) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}
}