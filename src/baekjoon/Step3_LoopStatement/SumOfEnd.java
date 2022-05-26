package baekjoon.Step3_LoopStatement;

import java.util.Scanner;

public class SumOfEnd {

	public static void main(String[] args) {
		int var1;
		int sum =0;;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < 1 || var1 > 10000);
		
		sc.close();
		
		for(int i =1; i <= var1 ; i++) {
			sum +=i;
		}
		
		System.out.println(sum);
	}
}
