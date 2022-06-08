package baekjoon.Step4_Array_One_Dimension;

import java.util.Scanner;

public class RemainCnt {

public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //10개 입력
        int[] arrayInt = new int[10];
        //나누는 수
        int shareNum =42;
        //10개 나머지
        int[] remainInt = new int[10];
        int[] resultInt = new int[10];
        
        int numOfArray = arrayInt.length;
        int sameCnt=0;
        int resultCnt =0;
        
        for(int i=0; i < numOfArray ; i++) {
            do{
                arrayInt[i] = sc.nextInt();
            }while(arrayInt[i]<0 || arrayInt[i] >1000);
        }//end for
        
        for(int i=0; i < numOfArray; i++ ) {
            remainInt[i] = arrayInt[i] % shareNum ;
        }//end for
        
        for(int i=0; i < numOfArray ; i++) {

            sameCnt=0;

            for(int j=i; j<numOfArray; j++) {

                if( i==0 && resultCnt==0){
                    resultInt[resultCnt] = remainInt[j];
                    resultCnt++;
                }else{

                    for(int k=0; k<resultCnt; k++) {

                        if( resultInt[k] == remainInt[j]) {
                            sameCnt++;    
                        }
                    }

                    if(sameCnt==0){
                        resultInt[resultCnt] = remainInt[j];
                        resultCnt++;
                    }
                }
            }//end j for
        }//end i for

        sc.close();
        System.out.println(resultCnt);
    }
}