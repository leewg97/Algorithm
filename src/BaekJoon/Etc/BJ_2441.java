package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별찍기 4
public class BJ_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = X - i; k > 0; k--) {
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
