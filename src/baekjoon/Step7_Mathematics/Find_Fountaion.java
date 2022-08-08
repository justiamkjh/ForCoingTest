package baekjoon.Step7_Mathematics;

import java.util.Scanner;

public class Find_Fountaion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputVal = sc.nextInt();
		int sum =2;
		int upperVal =1;
		int lowerVal =1;
		int idx = 1;
		
		if(inputVal == 1) {
			System.out.println(upperVal +"/"+lowerVal);
		}else {
			idx = 2;
			sum =3;

			while(idx <= inputVal) {
				
				//Â¦¼öÀÏ ¶§
				if(sum %2 ==0) {
					lowerVal =1;
					
					for(int i=1; i<=idx; i++) {
						upperVal -=1;
						lowerVal +=1;
					}
					
				}
				//È¦¼öÀÏ ¶§
				else {
					upperVal =1;
					
					for(int i=0; i<idx; i++) {
						System.out.println(i +" "+ idx);
						upperVal +=i;
						lowerVal -=i;
					}
				}
				
				idx ++;
			}//end for while
			
			System.out.println(upperVal +"/"+lowerVal);
			sum++;
		}
	}
}
