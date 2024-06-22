package Baekjoon_Algorithm;

// 설탕 5키로짜리 fSugar / 설탕 3키로짜리 tSugar
// 총 봉지 수 result
// 배달해야하는 설탕의 무게 sugarWeight

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
    public static BufferedReader br;
    public static int fSugar;
    public static int tSugar;
    public static int result;
    public static int sugarWeight;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        fSugar = 5;
        tSugar = 3;
        result = 0;

        sugarWeight = Integer.parseInt(br.readLine());

        if(sugarWeight == 4 || sugarWeight == 7) {
            result = -1;
        } else if (sugarWeight % fSugar == 0) {
            result = sugarWeight / fSugar;
        } else if (sugarWeight % fSugar == 1 || sugarWeight % fSugar == 3) {
            result = sugarWeight / fSugar + 1;
        } else if (sugarWeight % fSugar == 2 || sugarWeight % fSugar == 4) {
            result = sugarWeight / fSugar + 2;
        }
        System.out.println(result);
    }
}
