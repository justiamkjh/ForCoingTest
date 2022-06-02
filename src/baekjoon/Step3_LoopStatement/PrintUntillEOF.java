package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrintUntillEOF {
	
	public static void main(String[] args) throws IOException {
		int N;
		int X;
		int sum ;
		String result ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		do{
			sum =0;
			do {
				st = new StringTokenizer(br.readLine());
				N = Integer.parseInt(st.nextToken());
				X = Integer.parseInt(st.nextToken());
			} while ( (N < 0 || N > 10) && (X < 0 || X > 10));
			
			sum = N+X;
			if(sum!=0) {
				result = Integer.toString(sum)+"\n";
				bw.write(result);
			}
		}while((sum)!=0);
		
		bw.flush();
		bw.close();
	}
}
