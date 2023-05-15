package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수들의 합 2
public class BJ_2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(twoPointer(arr, M));
    }

    static int twoPointer(int[] arr, int M) {
        int count = 0, sum = 0, start = 0, end = 0;

        while(true) {
            if(sum >= M) sum -= arr[start++];
            else if(end >= arr.length) break;
            else sum += arr[end++];

            if(sum == M) count++;
        }

        return count;
    }
}
