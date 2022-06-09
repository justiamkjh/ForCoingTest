package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class NewAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		boolean chk = false;
		float max = 0;
		float newSum =0;
		
		do {
			cnt = sc.nextInt();
		}while(cnt < 0 || cnt > 1000);
		
		float[] arrayNum = new float[cnt];
		float[] arrayNewNum = new float[cnt];

		while(chk != true) {
			for(int i=0; i <cnt ; i++) {
				do {
					arrayNum[i] = sc.nextInt();
				}while(arrayNum[i] < 0 || arrayNum[i] > 100);
				
				if(arrayNum[i] > 0 && chk == false) chk=true;
			}
		}
		
		for(int i=0; i<arrayNum.length; i++) {
			if(arrayNum[i] > max) {
				max = arrayNum[i];
			}
		}
		
		for(int i=0; i<arrayNum.length; i++) {
			arrayNewNum[i] = arrayNum[i]/max*100;
			newSum += arrayNewNum[i];
		}
		
		sc.close();
		
		System.out.println((float)(newSum/arrayNum.length));
	}
}
