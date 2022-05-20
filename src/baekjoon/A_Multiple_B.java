package baekjoon;

import java.util.Scanner;

public class A_Multiple_B {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		int multiple = 0;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		}
		while(var1<0);
		
		do {
			var2 = sc.nextInt();
		}
		while(var2>10);
		
		multiple = var1 * var2;
		
		System.out.println(multiple);
	}

}
