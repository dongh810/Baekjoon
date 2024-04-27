package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int time = Integer.parseInt(st.nextToken());

        for (int i = 0; i < time; i++) {
            StringTokenizer token = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(token.nextToken());
            String str = token.nextToken();
            ArrayList<String> result = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                result.add(String.valueOf(str.charAt(j)));
            }

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(result.get(j));
                }
            }
            System.out.println();
        }
    }
}
