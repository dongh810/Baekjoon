package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 큐의 크기 N / 뽑으려는 숫자의 개수 M
// 큐 deque
// 2,3번 연산의 횟수 누적 합 result
// 뽑고자 하는 수를 담은 배열 seq
public class Baekjoon_1021 {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static int N;
    public static int M;
    public static LinkedList<Integer> deque;
    public static int result;
    public static int[] seq;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        deque = new LinkedList<>();
        result = 0;

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        seq = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int targer_index = deque.indexOf(seq[i]); // 뽑고자 하는 숫자의 위치(index) 찾기
            int half_index;

            if(deque.size() % 2 == 0) {
                half_index = deque.size() / 2-1;
            } else {
                half_index = deque.size() / 2;
            }

            // 원하는 수가 절반보다 앞에있을때 앞의 수를 뒤로 보내기 (2번)
            if(targer_index <= half_index) {
                for (int j = 0; j < targer_index; j++) {
                    int temp = deque.pollFirst(); // 맨 앞에있는 수를 검색 및 삭제
                    deque.offerLast(temp); // 맨 앞에 있던 수를 맨 뒤로 보냄
                    result++;
                }
            }
            // 원하는 수가 절반보다 뒤에있을때 뒤의 수를 앞으로 보내기 (3번)
            else {
                for (int j = 0; j < deque.size() - targer_index; j++) {
                    int temp = deque.pollLast(); // 맨 뒤에있는 수를 검색 및 삭제
                    deque.offerFirst(temp); // 맨 뒤에 있던 수를 맨 앞으로 보냄
                    result++;
                }
            }
            deque.pollFirst(); // 연산이 끝나면 맨 앞의 수를 삭제
        }

        System.out.println(result);
    }

}
