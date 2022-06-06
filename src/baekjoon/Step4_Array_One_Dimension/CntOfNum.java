package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class CntOfNum {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arrayInt = new int[3];
		int[] reusltInt = new int[10];
		int numOfArray = arrayInt.length;
		
		
		String multiple ;
		
	    for(int i=0; i<numOfArray ; i++) {
	    	
	    	arrayInt[i] = sc.nextInt();
	    }//end for
	    
	    multiple = String.valueOf(arrayInt[0]*arrayInt[1]*arrayInt[2]);
//	    System.out.println("multiple : " + multiple);
//	    System.out.println("multiple.length() : " + multiple.length());
	    String[] strArray = new String[multiple.length()]; 
	    
	    for(int i=0; i < multiple.length() ; i++) {
	    	
	    	if(i!=multiple.length()-1) {
	    		strArray[i] = multiple.substring(i,i+1);
	    		//System.out.println("strArray" + "[" + i +"]" + ": " + strArray[i]);
	    	}else {
	    		strArray[i] = multiple.substring(i);
	    		//System.out.println("strArray" + "[" + i +"]" + ": " + strArray[i]);
	    	}
	    }//end for

	    for(int i=0; i<multiple.length() ; i++) {
	    	
	    	for(int j=0; j < 10 ; j++) {
	    		
	    		if( Integer.valueOf(strArray[i]) == j) {
	    			reusltInt[j]++;
	    		}
	    		
	    	}//end j for
	    	
	    }//end i for
	    
	    sc.close();
	    for(int i=0; i<reusltInt.length ; i++) {
	    	System.out.println(reusltInt[i]);
	    }
	}
}