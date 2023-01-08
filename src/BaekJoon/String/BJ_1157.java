package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부
public class BJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) {   // 대문자 범위
                arr[str.charAt(i) - 65]++;                      // 해당 인덱스의 값 1 증가 (65 대신 'A"로 적어도 됨)
            } else {                                            // 소문자 범위
                arr[str.charAt(i) - 97]++;  
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);   // 대문자로 출력해야 하므로 65를 더함
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
