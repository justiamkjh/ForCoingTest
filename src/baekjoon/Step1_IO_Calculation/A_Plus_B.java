package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class A_Plus_B {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		}
		while(var1<0);
		
		do {
			var2 = sc.nextInt();
		}
		while(var2>10);
		
		sum = var1+var2;
		
		//System.out.println(var1+" + " + var2 +" = " + sum);
		System.out.println(sum);
	}

}
