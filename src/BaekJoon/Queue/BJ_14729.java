package BaekJoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 칠무해
public class BJ_14729 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        double[] N = new double[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(N);

        for (int i = 0; i < 7; i++) {
            System.out.println(N[i]);
        }

    }
}
