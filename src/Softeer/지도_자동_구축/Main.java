package Softeer.지도_자동_구축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 지도 자동 구축
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int row = 2;
        int dot = 4;

        if (N == 0) {
            System.out.println(4);
        } else {
            for (int i = 0; i < N; i++) {
                row = row + (row - 1);
                dot = row * row;
            }
            System.out.println(dot);
        }
    }
}
