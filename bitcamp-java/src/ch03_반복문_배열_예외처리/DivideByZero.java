package ch03_반복문_배열_예외처리;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dividend; //나뉨수
		int divisor; // 나눗수
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = sc.nextInt(); // 나뉨수 입력
		System.out.print("나눗수를 입력하시오: ");
		divisor = sc.nextInt();
		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("exception 발생");
		}
		
		sc.close();
	}

}
