package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2579 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(in.readLine());
        int[] arr = new int[h];


        for (int i = 0; i < h; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int result = arr[0];
        int max = 0;
        int count = 1;
        for (int i = 0; i < h - 2; i++) {
            if (count < 2) {
                max = Math.max(arr[i + 1], arr[i + 2]); // arr 1 20 arr 2 15
                result += max;  // 10+20
            } else if (count == 2) {
                max = arr[i + 2];
                result += max; // 55
                count = 1;
            }
            if (max == arr[i + 1]) {
                count++;
            } else if (max == arr[i + 2]) {
                i = i + 1;
            }
        }
        System.out.println(result);

    }
}
