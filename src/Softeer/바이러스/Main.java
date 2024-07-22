package Softeer.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바이러스
public class Main {

    public static int N, K, P;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        K = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        long result = K;
        for (int i = 0; i < N; i++) {
            result = (result * P) % 1000000007;
        }

        System.out.println(result);
    }
}
