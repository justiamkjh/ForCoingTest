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
				//��� ���� ��
				result = 10000 + var1*1000 ;
			}else {
				// 2���� ���� ��
				result = 1000 + var2*100 ;
			}
			
		}else if(var2 == var3) {
			// 2���� ���� ��
			result = 1000 + var2*100 ;
		}else if(var1 == var3) {
			// 2���� ���� ��
			result = 1000 + var1*100 ;
		}else {
			//��� �ٸ� ��
			/*
			 * ���׿����� ���� ������
			 * (���ǹ�) : ? �� : ���� ����
			 * */
			max = (var1 > var2) ? var1:var2;
			max = (max > var3) ? max:var3;
			result = max*100 ;
		}
		
		System.out.println(result);
		
	}
}
