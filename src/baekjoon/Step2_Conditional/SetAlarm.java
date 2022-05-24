package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class SetAlarm {

	public static void main(String[] args) {
		int var1;
		int var2;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < 0 || var1 > 23 );
		
		do {
			var2 = sc.nextInt();
		} while (var2 < 0 || var2 > 59 );
		sc.close();
		
		//MM
		if( var2 < 45) {
			
			var1--;
			var2=var2+60-45;
			
			if(var1 <0) {
				var1 =23;
			}
			
			System.out.println(var1 + " "+ var2);
			
		}else {
			System.out.println(var1 + " "+ (var2-45));
		}
	}
}