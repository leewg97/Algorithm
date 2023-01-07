package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 하얀 칸
public class BJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        String str = "";
        for (int i = 0; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                if ((i + j) % 2 == 0 && str.charAt(j) == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}