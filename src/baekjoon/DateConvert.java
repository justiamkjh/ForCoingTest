package baekjoon;

import java.util.Scanner;

public class DateConvert {

	public static void main(String[] args) {
		int var1;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		}
		//while( (var1 >= 1000) && (var1 <= 3000) );
		while( (var1 < 1000) || (var1 > 3000) );
		
		System.out.println(var1 -543);
	}
}