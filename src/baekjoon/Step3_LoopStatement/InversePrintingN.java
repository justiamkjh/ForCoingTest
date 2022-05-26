package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InversePrintingN {

	public static void main(String[] args) throws IOException{
		int var1;
		int sum=0;
		
		//¼±¾ð
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			var1 = Integer.parseInt(br.readLine());
		} while (var1 < 0 || var1 > 100000);
		
		
		for(int i =0; i < var1 ; i++) {
			sum = var1;
			sum -= i;
			
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
