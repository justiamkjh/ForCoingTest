package baekjoon.Step3_LoopStatement;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		int var1;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < 0 || var1 > 9 );
		
		sc.close();
		
		for(int i =1; i <10 ; i++) {
			
			System.out.println(var1 +" * "+ i +" = " + var1*i);
		}
	}

}
