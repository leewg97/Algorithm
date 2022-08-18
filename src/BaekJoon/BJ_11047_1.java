package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 동전 0
public class BJ_11047_1 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        10 4790
        1
        5
        10
        50
        100
        500
        1000
        5000
        10000
        50000
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] coins = new Integer[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins, Collections.reverseOrder());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (K >= coins[i]) {
                count += (K / coins[i]);
                K %= coins[i];
                if (K <= 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
