package Softeer.연탄의_크기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int answer = 0;

        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (String string : arr) {
                if (Integer.parseInt(string) % i == 0) count++;
            }

            answer = Math.max(answer, count);
        }

        System.out.print(answer);
    }

}
