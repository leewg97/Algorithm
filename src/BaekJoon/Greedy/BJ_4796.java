package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 캠핑
public class BJ_4796 {

    public static int L, P, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 1;

        StringBuilder sb = new StringBuilder();
        while (true) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int sum = (V / P) * L + Math.min((V % P), L);
            sb.append("Case ").append(num).append(":").append(" ").append(sum).append('\n');
            num++;
        }
            System.out.println(sb);
    }
}
