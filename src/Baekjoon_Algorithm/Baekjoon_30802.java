package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 총인원수 int pNum
// 사이즈별 신청자의 수 list orderList
// 티셔츠의 묶음 수 shirts / 펜의 묶음 수 pens / 개별 팬의 수 singlePen
public class Baekjoon_30802 {
    public static BufferedReader br;
    public static StringBuilder sb;
    public static StringTokenizer st;

    public static int pNum;
    public static ArrayList<Integer> orderList;
    public static int shirts;
    public static int pens;
    public static int singlePen;
    public static int penGroup;
    public static int shirtGroup;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pNum = Integer.parseInt(br.readLine().trim());

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine().trim());
        orderList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            orderList.add(Integer.valueOf(st.nextToken()));
        }
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine().trim());
        shirts = Integer.parseInt(st.nextToken());
        pens = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            int a = orderList.get(i);
            if(a == 0) {
                shirtGroup += 0;
            }
            if(a <= shirts) {
                shirtGroup += 1;
            } else {
                shirtGroup = shirtGroup + ((a/shirts) + 1);
            }
        }

        penGroup = pNum / pens;
        singlePen = pNum % pens;

        System.out.println(shirtGroup);
        System.out.println(penGroup + " " + singlePen);
    }
}
