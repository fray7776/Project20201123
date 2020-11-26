package com.ydm;

import java.util.Calendar;

public class CalendarEaxample {
	public static void calShow(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
		
		System.out.println("\t"+year+"년"+month+"월");
		
		String[] V={"SUN","MON","TUE","WED","TUR","FRI","SAT"};
		String week = 
		for(int i=0; i<V.length; i++) {
			i += week;
			System.out.printf("%2d",i);
		}
		for(int i=1; i<=31; i++) {
			System.out.printf("%3d",i);
			
			if(i%7==0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		calShow(1,2020);
	}

}