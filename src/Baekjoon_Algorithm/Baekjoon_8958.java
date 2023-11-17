package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8958 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(in.readLine());
        for (int i = 0; i < time; i++) {
            int total = 0;
            int score = 1;
            String s = in.readLine();
            if (s.charAt(0) == 'O') {
                total += 1;
            }
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    if (s.charAt(j - 1) == 'O') {
                        score += 1;
                    } else {
                        score = 1;
                    }
                    total += score;
                } else if (s.charAt(j) == 'X') {
                    score = 0;
                }

            }
            System.out.println(total);

        }
    }
}
