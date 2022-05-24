package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class FindLeapYear {
	
	public static void main(String[] args) {
		int var1;
		//int var2;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
			//var2 = sc.nextInt();
		} while (var1 < 1 || var1 > 4000);
		
		if( var1%4 ==0 && ( var1%100 !=0 || var1%400 ==0 ) ) {
			System.out.println("1");
			
		}else {
			System.out.println("0");
		}
	}
}
