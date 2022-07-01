package baekjoon.Step6_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CntWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
	
		do {
			str = sc.nextLine();
		}while(str.length() > 1000000);
		
		StringTokenizer st = new StringTokenizer(str, " ");

		sc.close();
		System.out.println(st.countTokens());
	}
}
