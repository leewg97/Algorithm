package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자 바꾸기
public class BJ_2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);
            } else if (c[i] >= 97 && c[i] <=122 ) {
                c[i] = (char) (c[i] - 32);
            }
        }
        System.out.println(c);
    }
}
