package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextInt();
		var2 = sc.nextInt();
		
		System.out.println(var1  + var2);
		System.out.println(var1  - var2);
		System.out.println(var1  * var2);
		System.out.println(var1  / var2);
		System.out.println(var1  % var2);
	}
}