package com.yedam;

import java.io.IOException;

public class StringExample {
	public static void main(String[] args) {
		String str1 = new String();
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str2 = new String(bytes); //생성자가 있기 때문에 호출이 가능
		System.out.println(str2.toString());
		
		String str3 = new String(bytes, 6, 4); //bytes 배열에서 6번째 4개의 값 도출
		System.out.println(str3.toString());
		
		byte[] bytes2 = new byte[100];
//	    try {
//			int readByteNo = System.in.read(bytes2);
//			String str4 = new String(bytes2,0,readByteNo);
//				System.out.println(str4);	
//			} catch (IOException e) {
//			e.printStackTrace();
//		}
	    
	    char chr = str2.charAt(0);
	    System.out.println(chr);
		
	}

}

