package baekjoon.Step6_String;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int idx =0;
		
		do {
			idx = sc.nextInt();
		}while(idx < 1 || idx > 100 );
		
		String inputVal = sc.next();
		int[] numArray = new int[idx];
		int sum =0;
		
		for(int i =0; i < idx ; i ++) {
			numArray[i]= Integer.parseInt(inputVal.substring(i, i+1));
			sum +=numArray[i];
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}
