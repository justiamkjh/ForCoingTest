package baekjoon;

import java.util.Scanner;
import java.util.stream.Stream;

public class ThreeMultiple {

	public static void main(String[] args) {
		int var1;
		int length1;
		int var2;
		int length2;
		
		int result1=0;
		int result2=0;
		int result3=0;
		int sum=0;

		Scanner sc = new Scanner(System.in);
		do {
			var1 = sc.nextInt();
			length1 = (int)(Math.log10(var1)+1);
		}
		while( (var1 < 0) || (length1 > 3) );

		do {
			var2 = sc.nextInt();
			length2 = (int)(Math.log10(var2)+1);
		}
		while( (var2 < 0) || (length2 > 3) );
		
//		System.out.println(var1);
//		System.out.println(var2);
		
		//int[] digits1 = Stream.of(String.valueOf(var1).split("")).mapToInt(Integer::parseInt).toArray();
        //System.out.print( Arrays.toString(digits1) ); // [1, 2, 3, 4, 5]
        
        int[] digits2 = Stream.of(String.valueOf(var2).split("")).mapToInt(Integer::parseInt).toArray();
        //System.out.print( Arrays.toString(digits2) ); // [1, 2, 3, 4, 5]
		
        result1	= var1* digits2[2];
		result2	= var1* digits2[1];
		result3	= var1* digits2[0];
		sum		=result1+(result2*10)+(result3*100);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(sum);
	}
}
