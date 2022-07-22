package baekjoon.Step7_Mathematics;

import java.util.Scanner;

public class Break_Even_Potin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputValue = new int[3];
		int fixedVal =0;
		int variableVal =0;
		int priceOfProduct =0;
		
		for(int i=0; i<inputValue.length; i++) {
			inputValue[i] = Integer.valueOf(sc.next());
			
			switch(i) {
			case 0 : fixedVal = inputValue[i];
				break;
			case 1 : variableVal = inputValue[i];
				break;
			case 2 : priceOfProduct = inputValue[i];
				break;
			}
		}

		int idx =0;
		
		if(variableVal >= priceOfProduct) {
			idx =-1;
		}else {
			idx = fixedVal / (priceOfProduct - variableVal);
			idx = idx+1;
		}
		
		sc.close();
		
		System.out.println(idx);
	}
}
