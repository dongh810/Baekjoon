package Baekjoon_Algorithm;

import java.util.Scanner;

//총 N개의 정수가 주어졌을 때, 정수 v가 몇개인지 구하는 프로그램을 작성하시오.
public class Baekjoon_10807 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = 0;
        int[] num;
        int search;
        int sum=0;
        a = input.nextInt();
        num = new int[a];
        for(int i=0;i<a;i++){
            num[i] = input.nextInt();
        }

        search = input.nextInt();
        for(int i =0;i<a;i++){
            if(search == num[i]){
                sum = sum+1;
            }
        }
        System.out.println(sum);

    }
}
