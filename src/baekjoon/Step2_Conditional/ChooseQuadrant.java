package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class ChooseQuadrant {

	public static void main(String[] args) {
		int var1;
		int var2;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < -1000 || var1 > 1000 || var1 ==0);
		
		do {
			var2 = sc.nextInt();
		} while (var2 < -1000 || var2 > 1000 || var2 ==0);
		
		if(var1 > 0 && var2 > 0) {
			System.out.println("1");
		}else if(var1 < 0 && var2 > 0){
			System.out.println("2");
		}else if(var1 < 0 && var2 < 0){
			System.out.println("3");
		}else if(var1 > 0 && var2 < 0){
			System.out.println("4");
		}
	}
}
