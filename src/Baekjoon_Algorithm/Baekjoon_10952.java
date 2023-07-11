package Baekjoon_Algorithm;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class Baekjoon_10952 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while(true){
            int a,b;
            a= in.nextInt();
            b= in.nextInt();
            if(a==0 && b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
