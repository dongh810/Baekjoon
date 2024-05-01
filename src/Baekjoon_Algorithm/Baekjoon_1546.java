package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    점수중 최댓값을 골라서 M
    모든 점수를 점수/M*100 으로 고친다.

    첫째 줄에 시험본 과목의 개수 N
    둘째 줄에 세준이의 현재 성적 / 적어도 하나의 값은 0보다 크다.

* */

public class Baekjoon_1546 {
    public static BufferedReader br;
    public static StringBuilder sb;
    public static StringTokenizer st;

    public static int subject_num;
    public static double[] scores;
    public static double max;
    public static double total;
    public static double avg;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        subject_num = Integer.parseInt(br.readLine().trim());
        scores = new double[subject_num];
        max = 0;
        total = 0;

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < subject_num; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (max < scores[i]) {
                max = scores[i];
            }
        }


        for (int i = 0; i < scores.length; i++) {
            total += (scores[i]/max) * 100;
        }
        avg = total/subject_num;
        sb.append(avg);
        System.out.println(sb);

    }
}
