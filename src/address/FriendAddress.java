package address;

import java.util.Scanner;

public class FriendAddress {
	// 주소록 생성 프로그램

	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.친구정보 |6.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("친구이름을 입력하세요!!");
				String name = scn.nextLine();
				System.out.println("전화번호 입력하세요!!");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break; // 한건 입력하면 빠져나와야한다.. 계속 저장하기 때문
					}

				}

			} else if (selectNo == 2) {
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

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}
			} else if (selectNo == 3) {
				System.out.println("친구이름을 입력하세요!!");
				String compname = scn.nextLine();
				System.out.println("전화번호 입력하세요!!");
				String compphone = scn.nextLine();
				System.out.println("회사이름을 입력하세요!!");
				String company = scn.nextLine();
				System.out.println("부서정보를 입력하세요!!");
				String department = scn.nextLine();
				CompFriend compfrnd = new CompFriend(compname, compphone);
				compfrnd.setCompany(company);
				compfrnd.setDepartment(department);

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = compfrnd;
						break;
					}
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendInfo();

					}
				}

			} else if (selectNo == 5) {
				System.out.println("친구의 전화번호 입력해라");
				String phone = scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && phone.equals(friends[i].getPhone())) {
						friends[i].showFriendInfo();

					}
				}

			} else if (selectNo == 6) {
				break;

			}

		}
		System.out.println("프로그램 종료");

	}

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
	// end of main

}// end of class

//메뉴 6번 연락처넣으면 showinfo 다 나오게 