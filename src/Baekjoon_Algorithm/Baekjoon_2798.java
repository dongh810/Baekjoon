package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 카드의 개수 cardNum / 최대값 maxNum / 최대값에 제일 가까운 resultNum
// 카드에 쓰여있는 수 numList
public class Baekjoon_2798 {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static int cardNum;
    public static int maxNum;
    public static ArrayList<Integer> numList;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        cardNum = Integer.parseInt(st.nextToken());
        maxNum = Integer.parseInt(st.nextToken());

        numList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cardNum; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        int result = search(numList, cardNum, maxNum);
        System.out.println(result);
    }

    static int search(ArrayList<Integer> numList, int cardNum, int maxNum) {
        int result = 0;

        for (int i = 0; i < cardNum - 2; i++) {
            for (int j = i + 1; j < cardNum - 1; j++) {
                for (int k = j + 1; k < cardNum; k++) {
                    int temp = numList.get(i) + numList.get(j) + numList.get(k);

                    if (maxNum == temp) {
                        return temp;
                    }

                    if(result < temp && temp < maxNum) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
