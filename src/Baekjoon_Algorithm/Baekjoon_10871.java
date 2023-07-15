package Baekjoon_Algorithm;

import java.util.Scanner;

// 정수N개로 이루어진 수열 A와 정수 X가 주어진다. 이때 A에서 X보다 작은 수를 출력하는 프로그램을 작성하시오.
public class Baekjoon_10871 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = 0;
        int min = 0;
        int[] num;

        number = in.nextInt();
        min = in.nextInt();
        num = new int[number];

        for(int i=0;i<number;i++){
            num[i] = in.nextInt();
        }
        for(int i=0;i<number;i++){
            if( num[i]<min){
                System.out.println(num[i]);
            }
        }



    }
}
