package baekjoon.Step1_IO_Calculation;

import java.util.Scanner;

public class Join_Member {

	public static void main(String[] args) {
		String var1;
		Scanner sc = new Scanner(System.in);
		
		/*
		 * do-while ������
		 * while ���� ���ǽ��� true �� �� �߰�ȣ {} �ҽ��� �ݺ��Ѵ�
		 * false�� do-while �� ���� 
		 * */
		do {
			var1 = sc.next();
		} while (var1.length() > 50); 
		
		System.out.println(var1 +"??!");
	}
}