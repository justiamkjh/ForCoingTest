package baekjoon.Step6_String;

import java.util.Scanner;

public class StudyWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//알파벳 개수는 26개
		int[] arr = new int[26];
		String str;
		
		do {
			str = sc.next();
		}while(str.length() > 1000000);
		
		for(int i =0; i <str.length(); i++) {
			
			//대문자 65~90
			if(65 <= str.charAt(i) &&  str.charAt(i) <= 90) {
				//해당 인덱스 값 1 증가
				arr[str.charAt(i) -65]++;
				//arr[str.charAt(i) -'A']++;
			}
			//소문자 97~122
			else if(97 <= str.charAt(i) &&  str.charAt(i) <= 122) {
				//해당 인덱스 값 1 증가
				arr[str.charAt(i) -97]++;
				//arr[str.charAt(i) -'a']++;
			}else continue;
		}//end for i
		
		int max =0;
		char ch ='?';
		
		for(int j=0; j<arr.length ;j++) {
			if(arr[j] > max) {
				max = arr[j]; 
				ch  = (char)(j+65);
			}else if(arr[j] ==max) {
				ch  = '?';
			}else continue;
		}//end for j
		
		sc.close();
		System.out.print(ch);
	}
}
