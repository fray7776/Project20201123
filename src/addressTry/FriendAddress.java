package addressTry;

import java.util.Scanner;

public class FriendAddress {
	public static void main(String[] args) {
		Friend[] frds = new Friend[100];
		Scanner scn = new Scanner(System.in);

		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.친구등록 | 2.학교친구 | 3.회사친구 | 4.전체리스트 | 5.친구정보 | 6.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("친구의 이름을 입력해보아라");
				String name = scn.nextLine();
				System.out.println("친구의 전화번호를 입력해보아라");
				String phone = scn.nextLine();
				Friend frd = new Friend(name, phone);
				for (int i = 0; i < frds.length; i++) {
					if (frds[i] == null) {
						frds[i] = frd;
						break;
					}
				}

			} else if (selectNo == 2) {
				System.out.println("학교친구의 이름을 입력해보아라");
				String name = scn.nextLine();
				System.out.println("학교친구의 전화번호를 입력해보아라");
				String phone = scn.nextLine();
				System.out.println("어디학교를 재학중인지 입력해보아라");
				String uni = scn.nextLine();
				System.out.println("학교친구의 전공을 입력해보아라");
				String major = scn.nextLine();
				UniFriend frd = new UniFriend(name, phone);
				frd.setuni(uni);
				frd.setMajor(major);
				
				for (int i = 0; i < frds.length; i++) {
					if (frds[i] == null) {
						frds[i] = frd;
						break;
					}
				}

			}else if (selectNo == 3) {
				System.out.println("회사친구의 이름을 입력해보아라");
				String name = scn.nextLine();
				System.out.println("회사친구의 전화번호를 입력해보아라");
				String phone = scn.nextLine();
				System.out.println("회사친구는 어디회사다니는지?? 입력해보아라");
				String company = scn.nextLine();
				System.out.println("회사친구의 부서를 입력해보아라");
				String department = scn.nextLine();
				CompFriend frd = new CompFriend(name,phone);
				frd.setCompany(company);
				frd.setDepartment(department);
				
				for (int i = 0; i < frds.length; i++) {
					if (frds[i] == null) {
						frds[i] = frd;
						break;
					}
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < frds.length; i++) {
					if (frds[i] != null) {
						frds[i].showFriendInfo();
						
					}
				}

			} else if (selectNo == 5) {
				for (int i = 0; i < frds.length; i++) {
					if(frds[i] != null && phone.equals(frds[i].getPhone())) {
						frds[i].showFriendInfo();
				}
					
				}

			} else if (selectNo == 6) {
				break;

			}
		}
		System.out.println("프로그램 종료");
	} // end of class

	private static CompFriend setCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

}// end of main
