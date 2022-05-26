package baekjoon.Step2_Conditional;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		int var3;
		
		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
		} while (var1 < 0 || var1 > 23 );
		
		do {
			var2 = sc.nextInt();
		} while (var2 < 0 || var2 > 59 );
		
		do {
			var3 = sc.nextInt();
		} while (var3 < 0 || var2 > 1000 );
		
		sc.close();
        
        var1 += var3 / 60;
        var2 += var3 % 60;

        if(var2>59) {
            var1 +=1;
            var2 -=60;
        }
        
        if(var1 > 23) {
            var1 -=24;
        }

        System.out.println(var1 + " "+ var2);
	}
}
