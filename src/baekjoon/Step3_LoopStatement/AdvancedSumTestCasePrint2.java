package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AdvancedSumTestCasePrint2 {

	public static void main(String[] args) throws IOException {
		int var1;
		int var2;
		int testcase;
		int sum=0;
		
		//¼±¾ð
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		do {
			testcase = Integer.parseInt(br.readLine());
		} while (testcase < 0 || testcase > 1000000);
		
		for(int i =1; i <= testcase ; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			do {
				var1 = Integer.parseInt(st.nextToken());
			} while (var1 < 0 || var1 > 1000 );
			
			do {
				var2 = Integer.parseInt(st.nextToken());
			} while (var2 < 0 || var2 > 1000 );
			
			sum=var1+var2;
			bw.write("Case #"+i+": "+var1+" + "+var2+" = "+sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
