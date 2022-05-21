package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class A_division_B {

	public static void main(String[] args) {
		
		double var1;
		double var2;
		double division = 0;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextDouble();
		}
		while(var1<0);
		
		do {
			var2 = sc.nextDouble();
		}
		while(var2>10);
		
		division = var1  / var2;
		
		System.out.println(division);
	}

}
