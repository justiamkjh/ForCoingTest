package baekjoon.Step5_Function;

public class SelfNumber {

	public static void main(String[] args) {
		int numRange =10000+1;
		boolean[] arrayChk = new boolean[numRange];
		
		for(int i=1; i<numRange; i++) {

			int n = selfNum(i);
		
			if(n < numRange) {
				arrayChk[n]=true;
			}
		}
		
		//1����10000���� ������ false�� ���
		for (int i = 1; i < numRange; i++) {   
			
            if (!arrayChk[i]) {
                System.out.println(i);
            }
        }
		
	}
	
	public static int selfNum(int number){
		int sum = number;
	    
		while(number != 0){
			sum += number % 10; 	// ù ° �ڸ���
			number = number/10;		// 10�� ������ ù ° �ڸ��� ���ش�
		}
	    
		return sum;
	}
}
