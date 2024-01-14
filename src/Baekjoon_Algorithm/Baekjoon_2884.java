package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();
        int timeCal;

        if( hour != 0){
            if (minute < 45) {
                hour--;
                minute = 60 - (45 - minute);
            } else if (minute >= 45) {
                minute = minute - 45;
            }
        } else {
            if (minute < 45) {
                hour = 23;
                minute = 60 - (45 - minute);
            } else if (minute >= 45) {
                minute = minute - 45;
            }
        }

        System.out.println(hour + " " + minute);


    }
}
