package baekjoon.Step6_String;

import java.util.Scanner;

public class Croatia_Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean flag;
		
		do {
			flag= true;
			str = sc.nextLine();
			
			for(int i=0; i<str.length(); i++) {
				//�ҹ��� �ƽ�Ű �ڵ� �ѹ�
				if(97 <= str.charAt(i) &&  str.charAt(i) <= 122) {
					continue;
				}
				//'-' : 45 , '=' : 61 �ƽ�Ű�ڵ�
				else if(str.charAt(i) == 45 || str.charAt(i) == 61) {
					continue;
				}else {
					flag = false;
					break;
				}
				
			}//end for i
			
		}while(str.length() > 100 || flag == false);
		
		System.out.println(str);
	}
}
