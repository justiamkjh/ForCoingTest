package baekjoon.Step6_String;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str="";
		int errCnt =0;
		int spendTime =0;
		String inputText;
		
		String[][] charArr = { {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"}};
		
		do {
			errCnt =0;
			str = sc.next();
			
			for(int i =0; i <str.length(); i++) {
				//´ë¹®ÀÚ 65~90
				if(65 <= str.charAt(i) &&  str.charAt(i) <= 90) {
					continue;
				}else errCnt++;
			}//end for i
			
		}while( str.length() < 2 || str.length() > 15 || errCnt > 0);
		
		sc.close();
		
		for(int i=0; i < str.length(); i++) {
			inputText = str.substring(i, i+1);
			
			for(int j=1; j < charArr[0].length; j++) {
				if(charArr[0][j].contains(inputText)) {
					spendTime += j+2;
				}else {
					continue;
				}
			}//end for j
		}//end for i 
		System.out.println(spendTime);
	}
}
