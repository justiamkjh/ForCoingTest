package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AdvancedSumTestCase {
	
	/*
	 * Java�� ����ϰ� �ִٸ�, 
	 * Scanner�� System.out.println ��� 
	 * BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
	 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
	 * 
	 * BufferedReader ���� 
	 * �Է��� readLine();�̶�� �޼ҵ带 ����Ѵ�. 
	 * String���� ���� ���� �����Ǿ� �ֱ� ������
	 * �ٸ� Ÿ������ �Է��� �ް��� �Ѵٸ� �ݵ�� ����ȯ�� �ʿ��ϴ�. 
	 * �׸���, ����ó���� �ݵ�� �ʿ�� �Ѵ�. 
	 * readLine()�� ���� try/catch������ �����־ �ǰ�
	 * throws IOException �� ���� ����ó���� �ص� �ȴ�.(��κ��� ��쿡 ���ڸ� ����Ѵ�.)
	 */
	
	public static void main(String[] args) throws IOException {
		int var1;
		int var2;
		int testcase;
		
		//����
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
