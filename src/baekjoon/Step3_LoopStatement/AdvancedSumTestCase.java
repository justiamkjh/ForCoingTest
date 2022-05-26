package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AdvancedSumTestCase {
	
	/*
	 * Java를 사용하고 있다면, 
	 * Scanner와 System.out.println 대신 
	 * BufferedReader와 BufferedWriter를 사용할 수 있다. 
	 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
	 * 
	 * BufferedReader 사용시 
	 * 입력은 readLine();이라는 메소드를 사용한다. 
	 * String으로 리턴 값이 고정되어 있기 때문에
	 * 다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다. 
	 * 그리고, 예외처리를 반드시 필요로 한다. 
	 * readLine()시 마다 try/catch문으로 감싸주어도 되고
	 * throws IOException 을 통한 예외처리를 해도 된다.(대부분의 경우에 후자를 사용한다.)
	 */
	
	public static void main(String[] args) throws IOException {
		int var1;
		int var2;
		int testcase;
		
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		do {
			testcase = Integer.parseInt(br.readLine());
		} while (testcase < 0 || testcase > 1000000);
		
		for(int i =0; i < testcase ; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			do {
				var1 = Integer.parseInt(st.nextToken());
			} while (var1 < 0 || var1 > 1000 );
			
			do {
				var2 = Integer.parseInt(st.nextToken());
			} while (var2 < 0 || var2 > 1000 );
			
			bw.write(var1+var2+"\n");
		}
		bw.flush();
		bw.close();
	}
}
