package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(in.readLine());

        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int yy, xx;
            if (num % h == 0) {
                yy = h;
                xx = num / h;
            } else {
                yy = num % h;
                xx = num / h + 1;
            }
            if (xx < 10) {
                System.out.println(yy + "0" + xx);
            } else if (xx >= 10) {
                System.out.printf("%d%d\n", yy, xx);
            }
        }
    }
}
