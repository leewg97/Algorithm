package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬수
public class BJ_1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            String reverse = new StringBuilder(str).reverse().toString();

            if (str.equals(reverse)) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);
    }
}
