package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(st.nextToken());
        for (int i = 1; i < 10; i++) {
            int result = a * i;
            System.out.println(a + " * " + i +" = " + result);
        }
    }
}
