package com.ydm.exception;

import java.sql.Connection;

import common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
		int num = 20;
		
		try {
			int[] numbers = new int[3];
			numbers[2] = 10;
		}catch (Exception e) {
			System.out.println("에러발생");
			
		}
		
		try {
			String str = null; // 예외 처리를 시ㄷ;ㅣㅅ
			
			System.out.println(str.toString());
		}catch (NullPointerException e ) {
			System.out.println("null값을 참조합니다.");
		}
		
		Connection conn= DAO.getConnection();
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
