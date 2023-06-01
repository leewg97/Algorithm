package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 날짜계산
public class BJ_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int e = 1, s = 1, m = 1;
        int E = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i = 1; ; i++) {
            if (e == E && s == S && m == M) {
                System.out.println(i);
                break;
            }
            e += 1;
            s += 1;
            m += 1;
            if (e == 16) e = 1;
            if (s == 29) s = 1;
            if (m == 20) m = 1;
        }

    }
}
