package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나이순 정렬
public class BJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder[] sb = new StringBuilder[201]; // 나이 범위 1~200
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb[age].append(age).append(' ').append(name).append('\n');  // 나이를 index 로 해당 배열에 넣기
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder stb : sb) {
            stringBuilder.append(stb);
        }

        System.out.println(stringBuilder);
    }
}
