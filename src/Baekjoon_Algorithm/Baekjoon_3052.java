package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        int real = 0;

        for (int i = 0; i < 10; i++) {
            int a = in.nextInt();
            arr[i] = a % 42;
        }

        for(int i =0; i<10;i++){
            int answer = 0;
            for(int j=i+1; j<10;j++){
                if(arr[i] == arr[j]){
                    answer = 1;
                }
            }
            if(answer == 0){
                real += 1;
            }
        }
        System.out.println(real);
    }
}
