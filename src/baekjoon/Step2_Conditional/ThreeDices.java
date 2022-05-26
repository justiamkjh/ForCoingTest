package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class ThreeDices {

	public static void main(String[] args) {

		int var1;
		int var2;
		int var3;
		int max=0;;
		int result=0;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < 0 || var1 > 6 );
		
		do {
			var2 = sc.nextInt();
		} while (var2 < 0 || var2 > 6 );
		
		do {
			var3 = sc.nextInt();
		} while (var3 < 0 || var2 > 6 );
		
		sc.close();
		
		if(var1 == var2) {
			
			if(var1 == var3) {
				//모두 같을 때
				result = 10000 + var1*1000 ;
			}else {
				// 2개만 같을 때
				result = 1000 + var2*100 ;
			}
			
		}else if(var2 == var3) {
			// 2개만 같을 때
			result = 1000 + var2*100 ;
		}else if(var1 == var3) {
			// 2개만 같을 때
			result = 1000 + var1*100 ;
		}else {
			//모두 다를 때
			/*
			 * 삼항연산자 사용법 익히기
			 * (조건문) : ? 참 : 거짓 문법
			 * */
			max = (var1 > var2) ? var1:var2;
			max = (max > var3) ? max:var3;
			result = max*100 ;
		}
		
		System.out.println(result);
		
	}
}
