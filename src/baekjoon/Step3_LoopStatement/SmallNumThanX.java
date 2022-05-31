package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallNumThanX {

	public static void main(String[] args) throws IOException {
		int N;
		int X;
		int sequnce;
		int cnt=0;
		
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer(String str) : 파싱 할 문자열을 인자로 받는다. 구분자를 지정하지 않았으므로 스페이스, 탭, 줄바꿈, 캐리지 리턴 등 기본 구분자가 적용된다.
		StringTokenizer st;
		
		do{
			//System.out.println("first");
			do {
				st = new StringTokenizer(br.readLine());
				N = Integer.parseInt(st.nextToken());
				X = Integer.parseInt(st.nextToken());
			//N
			} while ( (N < 1 || N > 10000) && (X < 1 || X > 10000));
//			System.out.println(st);
//			System.out.println("chk1");
			//초기화
			do {
				st = new StringTokenizer(br.readLine());
			}while(st.countTokens() != N);
			
//			System.out.println(st);
//			System.out.println("chk2");
			
			for(int i =0; i < N ; i ++) {
				sequnce = Integer.parseInt(st.nextToken());
				
				if(sequnce < X) {
					bw.write(sequnce+" ");
					cnt++;
				}
			}
		}while(cnt==0);
		
		bw.flush();
		bw.close();
	}
}

