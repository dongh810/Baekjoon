package Baekjoon_Algorithm;

import java.util.Scanner;

// 단어 $S$와 정수 $i$가 주어졌을 때, $S$의 $i$번째 글자를 출력하는 프로그램을 작성하시오.
public class Baekjoon_27866 {
    public static void main(String args[]){
        String a;
        int i;
        char b;
        Scanner in = new Scanner(System.in);

        a = in.nextLine();
        i = in.nextInt();
        b = a.charAt(i-1);
        System.out.println(b);
    }
}
