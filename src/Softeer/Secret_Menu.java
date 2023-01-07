package Softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 비밀메뉴
public class Secret_Menu {
    public static int M, N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder secretList = new StringBuilder();
        for (int i = 0; i < M; i++) {
            secretList.append(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        StringBuilder userList = new StringBuilder();
        for (int i = 0; i < N; i++) {
            userList.append(st.nextToken());
        }

        if (N < M) {
            System.out.println("normal");
        } else {
            if (userList.toString().contains(secretList.toString())) {
                System.out.println("secret");
            } else {
                System.out.println("normal");
            }
        }

    }
}
