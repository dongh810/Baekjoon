package Baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon_1837 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        BigInteger k = new BigInteger(st.nextToken());
        BigInteger p = new BigInteger(st.nextToken());

        BigInteger i = new BigInteger("1");

        while (true) {
            if (i.compareTo(p) == 1 || i.compareTo(p) == 0) {
                System.out.println("GOOD");
                break;
            }
            i = i.add(BigInteger.ONE);

            if (k.mod(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(p) == -1) {
                System.out.println("BAD" + " " + i);
                break;
            }
        }

    }

}
