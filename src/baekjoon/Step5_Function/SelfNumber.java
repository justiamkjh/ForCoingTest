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
		
		//1부터10000까지 돌려서 false만 출력
		for (int i = 1; i < numRange; i++) {   
			
            if (!arrayChk[i]) {
                System.out.println(i);
            }
        }
		
	}
	
	public static int selfNum(int number){
		int sum = number;
	    
		while(number != 0){
			sum += number % 10; 	// 첫 째 자리수
			number = number/10;		// 10을 나누어 첫 째 자리를 없앤다
		}
	    
		return sum;
	}
}
