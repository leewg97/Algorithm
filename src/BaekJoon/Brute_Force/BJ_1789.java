package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class BJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long sum = 0;
        int cnt = 0;

        for (int i = 1; ; i++) {
            if (sum > N) break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt - 1);
    }
}
