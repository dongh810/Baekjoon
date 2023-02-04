package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_25304 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int c = 0;
        for(int i=0;i<N;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            c = c+a*b;
        }
        if(c==X){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

}
