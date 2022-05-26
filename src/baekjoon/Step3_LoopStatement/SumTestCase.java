package baekjoon.Step3_LoopStatement;

import java.util.Scanner;

public class SumTestCase {

	public static void main(String[] args) {
		int var1;
		int var2;
		int testcase;
		
		Scanner sc = new Scanner(System.in);
		do {
			testcase = sc.nextInt();
		} while (testcase < 0 );
		
		for(int i =0; i < testcase ; i++) {
			
			do {
				var1 = sc.nextInt();
			} while (var1 < 0 || var1 > 10 );
			
			do {
				var2 = sc.nextInt();
			} while (var2 < 0 || var2 > 10 );
			
			System.out.println(var1+var2);
		}
		
		sc.close();
	}

}
