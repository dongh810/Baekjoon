package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력받을 배열 numArray[] / 입력받을 개수 K
// 입력받을 수 inputNum / 현재 위치 location

public class Baekjoon_10773 {
    public static BufferedReader br;
    public static int K;
    public static int[] numArray;
    public static int inputNum;
    public static int location;
    public static int result;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        numArray = new int[K];
        location = 0;
        result = 0;
        for (int i = 0; i < K; i++) {
            inputNum = Integer.parseInt(br.readLine());

            if(inputNum == 0 && i!=0) {
                numArray[location-1] = 0;
                location--;
            } else {
                numArray[location] = inputNum;
                location++;
            }
        }
        for (int i = 0; i < location; i++) {
            result = result + numArray[i];
        }
        System.out.println(result);
    }
}
