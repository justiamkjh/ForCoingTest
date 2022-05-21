package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class Join_Member {

	public static void main(String[] args) {
		String var1;
		Scanner sc = new Scanner(System.in);
		
		/*
		 * do-while 문에선
		 * while 문에 조건식이 true 일 때 중괄호 {} 소스를 반복한다
		 * false면 do-while 문 종료 
		 * */
		do {
			var1 = sc.next();
		} while (var1.length() > 50); 
		
		System.out.println(var1 +"??!");
	}
}