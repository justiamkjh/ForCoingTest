package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class CompareAtoB {

	public static void main(String[] args) {
		int var1;
		//int var2;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
			//var2 = sc.nextInt();
		} while (var1 < 0 || var1 > 100);
		
		if( 90 <= var1 && var1 <= 100 ) {
			System.out.println("A");
		}else if(80 <= var1 && var1 <= 89) {
			System.out.println("B");
		}else if(70 <= var1 && var1 <= 79){
			System.out.println("C");
		}else if(60 <= var1 && var1 <= 69){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
}
