package baekjoon.Step6_String;

import java.util.Scanner;

public class GroupWordChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int wordCnt =0;
		
		do {
			wordCnt = sc.nextInt();
		}while(wordCnt < 0 || wordCnt > 100);
		
		String[] strArray = new String[wordCnt];
		String str ="";
		boolean chkFlag;
		
		for(int i=0; i < wordCnt ; i++) {
			
			do {
				//�Է�
				chkFlag=true;
				str = sc.next();
				//����üũ
				if(0 < str.length() && str.length() <= 100) {
					System.out.println("����üũ �Ϸ�");
					for(int j=0 ; j<str.length(); j++) {
						//�ҹ��� üũ
						if(97 <= str.charAt(i) &&  str.charAt(i) <= 122) {
							System.out.println("�ҹ���üũ �Ϸ�");
							continue;
						}else {
							chkFlag = false;
							break;	
						}	
					}//end j
				}else {
					chkFlag = false;
					break;
				}
				
				//�ߺ�üũ
				if(i!=0 && chkFlag != false) {
					for(int k=0 ; k<i ; k++) {
//						System.out.println("k : " + k);
//						System.out.println("strArray[k] : " + strArray[k]);
//						System.out.println("str : " + str);
//						System.out.println("strArray[k].contains(str) : " + strArray[k].contains(str));
						if(strArray[k].contains(str)) {
							chkFlag = false;
							break;
						}else {
							System.out.println("�ߺ�üũ �Ϸ�");
						}
					}//end k
				}
			}while(chkFlag != true);
			
			strArray[i] = str;
			System.out.println("i : " + i + ", strArray[i] : " +strArray[i]);
		}//end i
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		sc.close();
	}
}
