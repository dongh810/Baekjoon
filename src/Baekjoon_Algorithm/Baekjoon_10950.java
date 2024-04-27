package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        in.nextLine();
        for (int i = 0; i < time; i++) {
            String ex = in.nextLine();
            String[] nums = ex.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            System.out.println(a+b);
        }

    }
}
