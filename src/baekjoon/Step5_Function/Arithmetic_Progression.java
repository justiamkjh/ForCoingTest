package baekjoon.Step5_Function;

import java.util.Scanner;

public class Arithmetic_Progression {
	/* AP : Arithmetic_Progression: 등차수열
	 * 한수 찾기 문제,
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		int num;
		
		do {
			num = sc.nextInt();
		}while(num < 0 || num > 1000);
		
		cnt = findAPCnt(num);
		
		if(num == 1000)cnt--;
		
		sc.close();
		System.out.println(cnt);
	}

	/* 한수 찾아 주는 함수 */
	public static int findAPCnt(int var) {
		int rtnNum =0;
		
		//100 미만 일 때는 숫자만큼 한 수.
		if(var < 100) {
			rtnNum = var;
		}else {
			//1~99까지의 값 초기화
			rtnNum = 99;
			
			for(int i=100; i<=var; i++) {
				
				int num100 = i / 100 % 10;
				int num10 = i / 10 % 10;
				int num1 = i % 10;
				
				if(num100-num10 == num10-num1) {
					rtnNum ++;
				}
			}//end for
		}
		return rtnNum;
	}
}
