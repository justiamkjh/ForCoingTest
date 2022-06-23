package baekjoon.Step6_String;

import java.util.Scanner;

public class Find_Aalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str ="";
		String[] alphaArr =new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
				
		do {
			str = sc.next();
		}while(str.length() <= 0 || str.length() > 100);
		
		int idx = str.length();
		int[] answerArr =new int[alphaArr.length];
		
		for(int k=0; k <answerArr.length ; k++) {
			answerArr[k]=-1;
		}
		
		//문자열 검색
		for(int i=0; i < idx ; i++) {
			//알파벳 26개
			for(int j=0 ; j< alphaArr.length ; j++) {
				if(str.substring(i, i+1).equals(alphaArr[j])) {
					if(answerArr[j]==-1) {
						answerArr[j]= i;
					}
				}
			}//for j
		}//for i
		
		for(int k=0; k <answerArr.length ; k++) {
			System.out.print(answerArr[k]+" ");
		}
	}
}
