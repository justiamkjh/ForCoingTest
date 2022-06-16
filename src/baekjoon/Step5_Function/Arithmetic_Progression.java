package baekjoon.Step5_Function;

import java.util.Scanner;

public class Arithmetic_Progression {
	/* AP : Arithmetic_Progression: ��������
	 * �Ѽ� ã�� ����,
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

	/* �Ѽ� ã�� �ִ� �Լ� */
	public static int findAPCnt(int var) {
		int rtnNum =0;
		
		//100 �̸� �� ���� ���ڸ�ŭ �� ��.
		if(var < 100) {
			rtnNum = var;
		}else {
			//1~99������ �� �ʱ�ȭ
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
