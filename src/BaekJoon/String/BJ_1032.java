package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 명령 프롬프트
public class BJ_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] c = st.nextToken().toCharArray();

        for (int i = 0; i < N - 1; i++) {   // 먼저 입력받은 c 제외
            st = new StringTokenizer(br.readLine());
            char[] file = st.nextToken().toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] != file[j]) {
                    c[j] = '?';
                }
            }
        }
        System.out.println(c);
    }
}

