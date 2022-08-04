package baekjoon.Step7_Mathematics;

import java.util.Scanner;

public class HouseOfBee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputVal = sc.nextInt();
		int range =2;
		int cnt =1;
		
		if(inputVal ==1) {
			System.out.println(1);
		}else {
			
			while(range <=inputVal) {
				
				range = range + (cnt*6);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
