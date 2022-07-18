package baekjoon.Step6_String;

import java.util.Scanner;

public class NewGroupWordChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int wordCnt = sc.nextInt();
		int cnt =0;
		
		for(int i=0; i < wordCnt ; i++) {
			//입력
			String str = sc.next();
			//알바펫 여부
			boolean check[] = new boolean[26];
			//그룹 단어 여부
			boolean idxFlag= true; 
			
			for(int j =0; j< str.length(); j++) {
				
				int idx = str.charAt(j)-'a';
				if(check[idx]) {
					//이전에 사용한 문자
					if(str.charAt(j) != str.charAt(j-1)) {
						idxFlag =false;
						break;
					}
				}else {
					//이전에 사용한 적이 없는 문자
					check[idx] =true; // 문자사용체크
				}
			}//end for j
			
			if(idxFlag) cnt++;
		}//end for i
		System.out.println(cnt);
		
		sc.close();
	}
}
