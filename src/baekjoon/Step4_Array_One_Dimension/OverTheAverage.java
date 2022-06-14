package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class OverTheAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//test case
		int testCase = sc.nextInt();
		
		int[] arrayTestCase = new int[testCase];
		int[] arrayScore;
		int sum;
		int average;
		double moreCnt;
		
		for(int i=0; i <testCase; i++ ) {
			sum =0;
			average =0;
			moreCnt =0;
			//각 case별 학생의 수
			do {
				arrayTestCase[i] = sc.nextInt();
			}while(arrayTestCase[i] < 1 || arrayTestCase[i] > 1000);
			
			arrayScore = new int[arrayTestCase[i]];
			
			//학생들의 점수
			for(int j =0; j < arrayTestCase[i] ; j++) {
				do {
					arrayScore[j] = sc.nextInt();
				}while(arrayScore[j] < 0 || arrayScore[j] > 100);
				
				sum += arrayScore[j];
			}//end j for
			
			average = sum / arrayScore.length;
			
			for(int k=0; k <arrayTestCase[i] ; k++) {
				if(arrayScore[k] > average) moreCnt++;
			}//end k for
			
			System.out.println( String.format("%.3f", (moreCnt / (double)(arrayScore.length)) *100)+"%");
		}//end i for
	}
}
