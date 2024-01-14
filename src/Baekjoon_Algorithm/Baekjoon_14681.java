package Baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        Quadrant(x,y);
    }

    public static void Quadrant(int x, int y){
        if(x>0 && y>0){
            System.out.println("1");
        } else if(x<0 && y>0) {
            System.out.println("2");
        } else if(x<0 && y<0) {
            System.out.println("3");
        } else if(x>0 && y<0) {
            System.out.println("4");
        }
    }
}
