package baekjoon.Step4_Array_One_Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Min_Max {

	public static void main(String[] args) throws IOException {
		
		int numOfInt;
	    int[] arrayInt ;
	    int errCnt =0;
	    int min=0;
	    int max=0;
	    		
		int tokenCnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		do {
			st = new StringTokenizer(br.readLine());
			numOfInt = Integer.valueOf(st.nextToken());
		} while( numOfInt < 1 || numOfInt > 1000000 );
		
		do {
			//배열 생성
			arrayInt = new int[numOfInt];
			st = new StringTokenizer(br.readLine());
			tokenCnt = st.countTokens();
		
			for (int i=0; i < numOfInt; i++) {
				arrayInt[i] = Integer.valueOf(st.nextToken());
	
				if( arrayInt[i] < -1000000 || arrayInt[i] >1000000 ) {
					errCnt++;
				}
			}
			
		} while( tokenCnt != numOfInt || errCnt > 0);
		
		if(numOfInt ==1) {
			min=arrayInt[0];
			max=arrayInt[0];
		}else {

			for (int i=0; i < numOfInt; i++) {
				
				if(i==0) {
					//min
					if(arrayInt[i] < arrayInt[i+1]) {
						min=arrayInt[i];					
					}else {
						min=arrayInt[i+1];
					}
					//max
					if(arrayInt[i] > arrayInt[i+1]) {
						max=arrayInt[i];
					}else {
						max=arrayInt[i+1];
					}
				}else {
					
					if(min > arrayInt[i] ) {
						min = arrayInt[i];
					}
					if(max < arrayInt[i]) {
						max = arrayInt[i];
					}
				}
			}//end for
			
		}
		
		bw.write(String.valueOf(min)+" "+String.valueOf(max));
		
		bw.flush();
		bw.close();
	}
}
