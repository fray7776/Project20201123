package com.yedam.string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-4230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1' :  
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
		
		String strVal1 = new String("송혜원"); 
		String strVal2 = "송혜원"; 
		
		if(strVal1 == strVal2) {   //클래스이기 때문에 주소값을 비교
			System.out.println("같은 String 객체를 참조"); 
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVal1.equals(strVal2)) {  //equals를 사용해 문자값을 비교
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		String str = "안녕하세요!";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1.>String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2>String> "+ str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes3 > String: "+ str3);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련이 있네요");
			
		}else {
			System.out.println("자바와 관련이 없군요");
		}
		
		String scc = "128513215456";
		
		int length = scc.length();
		
		if(length == 10) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민번호 자릿수가 아니다");
		}
		
		String oldStr = "안녕후후룰루";
		String newStr = oldStr.replace("안녕","거기");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String num = "920331-1445612";
		
		String firstNum = num.substring(0,6);
		System.out.println(firstNum);
		
		String thirdNum = num.substring(9);
		System.out.println(thirdNum);
		
		String original = "I hate java";
		String lowercase = original.toLowerCase();
		String Uppercase = original.toUpperCase();
		
		System.out.println(lowercase);
		System.out.println(Uppercase);
		
		System.out.println(lowercase.equals(Uppercase));
		
		String birth1 = "991123-1234567";
		String birth2 = "991112_2345678";
		String birth3 = "010101*3123456";
		String birth4 = "0202024211234";
		
		String gNum1 = birth1.substring(7);
		String gNum2 = birth2.substring(7);
		String gNum3 = birth3.substring(7);
		String gNum4 = birth4.substring(7);
		
		System.out.println(gNum1);
		
		String ary[i] = {gNum1, gNum2, gNum3, gNum4};
		for(ary[i]==1) {
			if(ary[i]==3) {
				System.out.println("getGenderInfo");
			}
		}
		
				
	}
	 

}
