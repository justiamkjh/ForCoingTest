package baekjoon.Step6_String;

import java.util.Scanner;

public class Repeat_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		
		do{
			cnt = sc.nextInt();
		}while(cnt < 1 || cnt > 1000);

		int repeatCnt =0;
		String str ="";
		String [] testStr =new String[cnt];
		String outputStr ="";
		int [] repeatIdx = new int[cnt];
		String [] qrCode = new String[] {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","|","$","%","*","+","-",".","/",":"};
		int strChk;
		
		for(int i=0; i < cnt ; i++) {
			do{
				repeatCnt = Integer.parseInt(sc.next());
			}while(repeatCnt < 1 || repeatCnt > 8);
			repeatIdx[i] = repeatCnt;
			
			do{
				strChk = 0; //qrCode 문자 체크
				str= sc.next();
				for(int j =0; j<str.length(); j ++) {
					for(int k=0; k<qrCode.length; k++) {
						if(str.substring(j, j+1).equals(qrCode[k])) {
							strChk++;
							testStr[i] = str;
						}
					}//end k
				}//end j
				
			}while(str.length() < 1 || str.length() > 20 || strChk <=0);

		}//end for i
		
		//결과출력
		for(int k=0; k < testStr.length ; k++) {
			//testStr[0] = ABC
			outputStr = testStr[k];
			for(int j=0 ; j <outputStr.length(); j++ ) {
				for(int t=0; t < repeatIdx[k]; t++) {
					
					if(j+1== outputStr.length() && t+1== repeatIdx[k]) {
						System.out.println(outputStr.substring(j, j+1));
					}else {
						System.out.print(outputStr.substring(j, j+1));
					}
				}
			}
		}
		
		sc.close();
	}
}
