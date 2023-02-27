package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_11021 {
    public static void main(String args[]){
        int a,b,c,i;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (i = 0; i < a; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            System.out.println("Case #"+(i+1)+": "+(b+c));


        }


    }
}
