package com.ydm;

import java.util.Scanner;

public class MorningPractice {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {
			
			System.out.println("=============================");
			System.out.println("1.정수입력 | 2.오름차순 정렬");
			System.out.println("=============================");
			System.out.println("선택> ");
			int selecNo = scn.nextInt();scn.nextLine();
			
			int num =  0;  //1
			int num1 = 0; //2
			int num2 = 0; //3
			
			if(selecNo==1) {
				System.out.println("정수1을 입력하시오");
				num = scn.nextInt();
				scn.nextLine();
				System.out.println("정수2를 입력하시오");
				num1 = scn.nextInt();
				scn.nextLine();
				System.out.println("정수3을 입력하시오");
				num2 = scn.nextInt();
				scn.nextLine();
				
				
			}else if(selecNo ==2) {
				if(num>num1 && num>num2 && num1>num2) {
					System.out.println(num+","+num1+","+num2);
				}else if(num>num1 && num>num2 && num2>num1) {
					System.out.println(num+","+num2+","+num1);
				}else if(num1>num2 && num1>num && num2>num) {
					System.out.println(num1+","+num2+","+num);
				}else if(num1>num && num1>num2 && num2>num) {
					System.out.println(num1+","+num+","+num2);
				}else if(num2>num && num2>num1 && num1>num) {
					System.out.println(num2+","+num1+","+num);
				}else if(num2>num && num2>num1 && num>num1) {
					System.out.println(num2+","+num+","+num1);
					break;
				}
			}
			
		}
		System.out.println("프로그램 종료!!!!");

	}
}
