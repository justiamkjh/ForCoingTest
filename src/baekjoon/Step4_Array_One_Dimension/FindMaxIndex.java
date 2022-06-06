package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class FindMaxIndex {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arrayInt = new int[9];
		int max=0;
		int maxIdx=0;
		
	    int numOfInt;
	    numOfInt = arrayInt.length;
	    		
	    for(int i=0; i<numOfInt ; i++) {
	    	
	    	arrayInt[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<numOfInt ; i++) {
	    	
	    	if(arrayInt[i] > max) {
	    		max =arrayInt[i];
	    		maxIdx = i+1;
	    	}
	    }//end for
	    
	    sc.close();
	    System.out.println(max);
	    System.out.println(maxIdx);
		
	}
}