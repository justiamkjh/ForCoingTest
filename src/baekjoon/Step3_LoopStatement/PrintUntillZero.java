package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrintUntillZero {
	
	public static void main(String[] args) throws IOException {
		int N;
		int X;
		int sum ;
		String result ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// java EOF ��� ctrl+z
		String str = "";
		// str ������ readLine()���� ����, EOF��� null���� ����Ǿ����Ű� �ݺ����� ��������
		while( (str = br.readLine()) != null ) {
		
			sum =0;
			do {
				st = new StringTokenizer(str, " ");
				N = Integer.parseInt(st.nextToken());
				X = Integer.parseInt(st.nextToken());
			} while ( (N < 0 || N > 10) && (X < 0 || X > 10));
			
			sum = N+X;
			
			result = Integer.toString(sum)+"\n";
			bw.write(result);
			str = "";
		}
		
		bw.flush();
		bw.close();
	}
}
