package baekjoon.Step3_LoopStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarPrint {

	public static void main(String[] args) throws IOException {
		int loop;
		
		//¼±¾ð
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			loop = Integer.parseInt(br.readLine());
		} while (loop < 0 || loop > 100);
		
		for(int i =loop; i > 0 ; i--) {

			for(int j=1; j<=loop ;j++) {

				if(j>=i) {
					bw.write("*");
				}else {
					bw.write(" ");
				}
				
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
