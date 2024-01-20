package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_4153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] triangle = new int[3];

        while(true){
            for (int i = 0; i < 3; i++) {
                triangle[i] = in.nextInt();
            }
            if(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0){
                break;
            }
            else if ((triangle[0] * triangle[0]) + (triangle[1] * triangle[1]) == (triangle[2] * triangle[2])) {
                System.out.println("right");
            }
            else if ((triangle[0] * triangle[0]) == (triangle[1] * triangle[1]) + (triangle[2] * triangle[2])) {
                System.out.println("right");
            }
            else if ((triangle[0] * triangle[0]) + (triangle[2] * triangle[2]) == (triangle[1] * triangle[1])) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}
