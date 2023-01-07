package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한수
public class BJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (N < 100) {
            System.out.println(N);
        } else {
            cnt = 99;
            for (int i = 100; i <= N; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
