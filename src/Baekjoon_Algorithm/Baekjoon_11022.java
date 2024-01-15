package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_11022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0; i<T;i++){
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B));
        }


    }
}
