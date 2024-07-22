package Softeer.연탄_배달의_시작;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int len = Integer.MAX_VALUE;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                len = Math.min(len, arr[i] - arr[i - 1]);
            }
        }

        int count = 0;
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == len) count++;
        }

        System.out.println(count);
    }
}
