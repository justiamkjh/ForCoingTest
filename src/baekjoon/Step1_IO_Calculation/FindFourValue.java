package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class FindFourValue {

	public static void main(String[] args) {
		int var1;
		int var2;
		int var3;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		}
		while( (var1 < 2) || (var1 >10000));
		
		do {
			var2 = sc.nextInt();
		}
		while( (var2 < 2) || (var2 >10000));
		
		do {
			var3 = sc.nextInt();
		}
		while( (var3 < 2) || (var3 >10000));
		
		System.out.println( (var1+var2)%var3);
		System.out.println( ( (var1%var3) + (var2%var3)) % var3);
		System.out.println( (var1*var2)%var3);
		System.out.println( ( (var1%var3) * (var2%var3)) % var3);
	}
}
