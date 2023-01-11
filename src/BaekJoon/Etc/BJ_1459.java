package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 걷기
public class BJ_1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        long s = Integer.parseInt(st.nextToken());

        // 평행이동
        long m1 = (x + y) * w;

        // 짝수, 홀수에 따른 이동
        long m2 = 0;
        if ((x + y) % 2 == 0) { // 짝수일 때 대각으로
            m2 = Math.max(x, y) * s;
        } else {    // 홀수일 때
            m2 = (Math.max(x, y) - 1) * s + w;
        }

        // 대각 + 평행
        long m3 = (Math.min(x, y) * s + (Math.abs(x - y) * w));

        System.out.println(Math.min(Math.min(m1, m2), m3));
    }
}