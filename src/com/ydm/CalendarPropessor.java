package com.ydm;

import java.util.Calendar;

public class CalendarPropessor {
	public static void showCal(int year, int month) {
		System.out.println("\t[" + year + "년 " + month + "월]");
		// 요일 정보 출력.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		int tMonth = month - 1; // 입력월과 Calendar월 매칭.
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int lDate = cal.getActualMaximum(Calendar.DATE);// 마지막날
		int fDay = cal.get(Calendar.DAY_OF_WEEK);// 첫째날 요일정보

		// 1일의 위치지정
		for (int i = 1; i < fDay; i++) {
			System.out.printf("%4s", " ");
		}
		// 월의 마지막 날짜만큼 출력
		for (int i = 0; i < lDate; i++) {
			System.out.printf("%4d", (i + 1));
			if ((i + fDay) % 7 == 0)
				System.out.println();
		}

	}// end of showCal
	
	public static void main(String[] args) {
		showCal(2020,12);
	}

}
