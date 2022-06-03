package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SumCycle {
	
	public static void main(String[] args) throws IOException {
		int initVar=0;
		int newVar=0;
		int cycleIdx =0;
		int var=0;
		String strVar = "";
		int first=0;
		int second=0;
		String result="";
		String cycleSum ="";
		int cycleSecond =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		do {
			st = new StringTokenizer(br.readLine());
			initVar = Integer.parseInt(st.nextToken());
		} while( initVar < 0 || initVar > 99);
		
		while(initVar != newVar) {
			if(cycleIdx==0) {
				var=initVar;
			}else {
				var=newVar;
			}
			
			if(var < 10) {
				strVar = 0+String.valueOf(var);
				first = Integer.parseInt(strVar.substring(0,1));
				second  = Integer.parseInt(strVar.substring(1,2));
				
			}else {
				strVar = String.valueOf(var);
				first = Integer.parseInt(strVar.substring(0,1));
				second  = Integer.parseInt(strVar.substring(1,2));
				
			}
			
			cycleSum = String.valueOf(first+second);
			
			if( (first+second) >= 10) {
				cycleSecond  = Integer.parseInt(cycleSum.substring(1,2));
			}else {
				cycleSecond  = Integer.parseInt(cycleSum.substring(0,1));
			}
			newVar =  Integer.parseInt(String.valueOf(second)+String.valueOf(cycleSecond));
			cycleIdx++;
		}
		
		if(initVar ==0) {
			cycleIdx++;
		}
		result = String.valueOf(cycleIdx);
		bw.write(result);
		
		bw.flush();
		bw.close();
	}
}
