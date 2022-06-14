package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class OX_Quize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		String[] arrayNum = new String[testCase];
		int sum =0;
		int totalSum =0;

		for(int i=0; i <arrayNum.length ; i++) {
			do {
				arrayNum[i] = sc.next();
			}while(arrayNum[i].length() < 0 || arrayNum[i].length() > 80);
		}
		
		for(int i=0; i<testCase; i++) {
			
			int[] arraySum = new int[arrayNum[i].length()];
			sum =0;
			totalSum = 0;
			
			for(int j =0; j <arrayNum[i].length(); j++ ) {
				
				//최초 0
				if( j==0 && (arrayNum[i].substring(j,j+1).equals("O")) ) {
					sum =sum+1;
					arraySum[j]=sum;
				}
				//최초 X
				else if(j==0 && (arrayNum[i].substring(j,j+1).equals("X"))) {
					sum =0;
					arraySum[j]=sum;
				}
				// X
				else if(j!=0 && (arrayNum[i].substring(j,j+1).equals("X"))) {
					sum =0;
					arraySum[j]=sum;
				}
				//X0
				else if(j!=0 && arrayNum[i].substring(j-1,j).equals("X") && arrayNum[i].substring(j,j+1).equals("O")) {
					sum =sum+1;
					arraySum[j]=sum;
				}
				//연속0
				else if(j!=0 && arrayNum[i].substring(j-1,j).equals("O") && arrayNum[i].substring(j,j+1).equals("O")) {
					sum =sum+1;
					arraySum[j]=sum;
				}
			}//end for
			
			for(int k =0; k <arrayNum[i].length(); k++ ) {
				totalSum += arraySum[k];
			}
			System.out.println(totalSum);
		}//end for
		
		sc.close();
	}
}
