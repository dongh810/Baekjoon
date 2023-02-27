package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_5597 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int b[] = new int[31];
        int c[] = new int[29];
        for(int i=1; i<=30; i++){
            b[i] = i;
        }
        for(int i=0;i<28;i++){
            c[i] = in.nextInt();
            b[c[i]] = 0;
        }
        for(int i=1;i<=30;i++){
            if(b[i] != 0)
            {
                System.out.println(i);
            }
        }

    }
}
