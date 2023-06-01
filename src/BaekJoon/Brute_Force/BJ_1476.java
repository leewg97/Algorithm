package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜계산
public class BJ_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = 15;
        int S = 28;
        int M = 19;

        int year = 0;

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (e == E) e = 0;
        if (s == S) s = 0;
        if (m == M) m = 0;

        do {
            year += 1;
        } while (year % E != e || year % S != s || year % M != m);

        System.out.println(year);
    }
}
