package Baekjoon_Algorithm;

import java.util.Scanner;

// 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
// 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
// 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
// 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
public class Baekjoon_10813 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N=0;
        int M=0;
        int[] array;
        int a=1;
        int x,y=0;
        N=in.nextInt();
        M=in.nextInt();
        array = new int[N];

        for(int i=0; i<N ;i++){
            array[i]=a;
            a++;
        }
        for(int i=0;i<M;i++){
            x = in.nextInt();
            y = in.nextInt();
            int temp =0;
            temp = array[x-1];
            array[x-1] = array[y-1];
            array[y-1] = temp;
        }
        for(int j=0; j<N;j++){
            System.out.println(array[j]);
        }
    }
}
