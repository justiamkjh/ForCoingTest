package baekjoon.Step6_String;

import java.util.Scanner;

public class NewGroupWordChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int wordCnt = sc.nextInt();
		int cnt =0;
		
		for(int i=0; i < wordCnt ; i++) {
			//�Է�
			String str = sc.next();
			//�˹��� ����
			boolean check[] = new boolean[26];
			//�׷� �ܾ� ����
			boolean idxFlag= true; 
			
			for(int j =0; j< str.length(); j++) {
				
				int idx = str.charAt(j)-'a';
				if(check[idx]) {
					//������ ����� ����
					if(str.charAt(j) != str.charAt(j-1)) {
						idxFlag =false;
						break;
					}
				}else {
					//������ ����� ���� ���� ����
					check[idx] =true; // ���ڻ��üũ
				}
			}//end for j
			
			if(idxFlag) cnt++;
		}//end for i
		System.out.println(cnt);
		
		sc.close();
	}
}
