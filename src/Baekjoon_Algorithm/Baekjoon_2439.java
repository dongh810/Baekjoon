package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i =1; i<=a;i++) {
            for(int b =a; b>0;b--) {
                if (b <= i) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                }
            System.out.print("\n");
            }

        }
    }

