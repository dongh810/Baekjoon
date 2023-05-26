package Baekjoon_Algorithm;

import java.util.Scanner;

//첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
// 두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
//입력으로 주어지는 모든 수는 정수이다.
public class Baekjoon_12865 {
    public void main(String args[]){
        int [][]arr = new int[2][];
        int N,K;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] =0;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("물품의 수 N을 입력하세요");
        arr[0][0] = sc.nextInt();
        N = arr[0][0];
        arr[0] = new int[N];
        System.out.println("준서가 버틸수 있는 무게 K를 입력하세요");
        arr[0][1] = sc.nextInt();
        K = arr[0][1];
        arr[1] = new int[K];
        System.out.println("두번째 줄부터"+N+ "개의 줄에 거쳐 각 물건의 무게 W(1 <= W <= 100000)와 해당 물건의 가치 V(0<=V<=1000)를 입력해주세요");
        /*arr[1][0] = sc.nextInt();
        arr[1][1] = sc.nextInt();
        arr[2]*/
    }
}
