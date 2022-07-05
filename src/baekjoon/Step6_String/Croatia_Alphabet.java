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
				//소문자 아스키 코드 넘버
				if(97 <= str.charAt(i) &&  str.charAt(i) <= 122) {
					continue;
				}
				//'-' : 45 , '=' : 61 아스키코드
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
