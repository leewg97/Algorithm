package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 돌 게임
public class BJ_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2로 나누었을 때 나머지가 1이라면 SK 출력하고 아니면 CY 출력
        System.out.println(N % 2 == 1 ? "SK" : "CY");
    }
}
