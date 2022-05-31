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
		
		//����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer(String str) : �Ľ� �� ���ڿ��� ���ڷ� �޴´�. �����ڸ� �������� �ʾ����Ƿ� �����̽�, ��, �ٹٲ�, ĳ���� ���� �� �⺻ �����ڰ� ����ȴ�.
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
			//�ʱ�ȭ
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

