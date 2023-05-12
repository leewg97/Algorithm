package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주식투자
public class BJ_13416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[3];

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int max = 0;
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[0] = Integer.parseInt(st.nextToken());
                arr[1] = Integer.parseInt(st.nextToken());
                arr[2] = Integer.parseInt(st.nextToken());

                if (arr[0] < 0 && arr[1] < 0 && arr[2] < 0) continue;
                max += Math.max(Math.max(arr[0], arr[1]), arr[2]);
            }
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}
