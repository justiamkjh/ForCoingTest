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
		
		for(int i=0; i < strArray.length ; i++) {
			
			do {
				//입력
				chkFlag=true;
				str = sc.next();
				//길이체크
				if(0 < str.length() && str.length() <= 100) {

					for(int j=0 ; j<str.length(); j++) {
						//소문자 체크
						if(97 <= Integer.valueOf(str.charAt(j))  &&  Integer.valueOf(str.charAt(j)) <= 122) {
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
				
				//중복체크
				if(i!=0 && chkFlag != false) {
					for(int k=0 ; k<i ; k++) {
						if(strArray[k].equals(str)) {
							chkFlag = false;
							break;
						}else continue;
					}//end k
				}
			}while(chkFlag != true);
			
			strArray[i] = str;
		}//end i
		
		int cnt =0;
		boolean idxFlag=false;
		String[] testStrArray; 
		String jstr="";
		String kstr="";
		//체크부
		for(int i=0; i<strArray.length; i++) {
			testStrArray = new String[strArray[i].length()];
			
			for(int j=0; j< strArray[i].length(); j++) {
				idxFlag =false;
				testStrArray[j] = String.valueOf(strArray[i].subSequence(j, j+1));
				jstr = testStrArray[j];
				
				if(j!=0){
					
					for(int k=0; k<j ;k++) {
						kstr = testStrArray[k];
						
						if(jstr.equals(kstr) && j-k ==1) {
							//System.out.println("chk1 i : " +i+", j : "+j+", jstr : " + jstr+ ", k : "+k +", kstr : "+kstr);
							idxFlag =true;
						}else if(!jstr.equals(kstr)) {
							//System.out.println("chk2 i : " +i+", j : "+j+", jstr : " + jstr+ ", k : "+k +", kstr : "+kstr);
							idxFlag =true;
						}else {
							//System.out.println("chk3 i : " +i+", j : "+j+", jstr : " + jstr+ ", k : "+k +", kstr : "+kstr);
							idxFlag =false;
							break;
						}
						
					}//end for k
				}else if(j==0) {
					idxFlag =true;
				}
			}//end for j
			
			if(idxFlag ==true) cnt++;
		}//end for i
		System.out.println(cnt);
		
		sc.close();
	}
}
