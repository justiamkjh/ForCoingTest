package baekjoon.Step6_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CompareConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String var1="";
		String var2="";
		
		do {
			StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
			
			while(st.hasMoreTokens()) {
				var1 = st.nextToken();
				var2 = st.nextToken();
			}
			
		}while( var1.contains("0") || var2.contains("0")
			 || var1.length() <= 0  || var1.length() > 3
			 || var2.contains("0") || var2.contains("0")
			 || var2.length() <= 0  || var2.length() > 3 );
		
		String newVar1 = "";
		String newVar2 = "";
		
		for(int i = var1.length()-1 ; i >= 0 ; i--) {
			newVar1 = newVar1.concat(String.valueOf(var1.charAt(i))) ;
		}
		
		for(int i = var2.length()-1 ; i >= 0 ; i--) {
			newVar2 = newVar2.concat(String.valueOf(var2.charAt(i))) ;
		}
		
		sc.close();
		
		int intvar1 = Integer.valueOf(newVar1);
		int intvar2 = Integer.valueOf(newVar2);
		
		if(intvar1 > intvar2) {
			System.out.println(intvar1);
		}else {
			System.out.println(intvar2);
		}
	}
}
