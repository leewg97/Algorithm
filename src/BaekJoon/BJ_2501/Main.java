package BJ_2501;

import java.io.*;
import java.util.StringTokenizer;

// 약수 구하기
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int index = 1; index <= N; index++) {
            if (N % index == 0) {
                K--;
                if (K == 0) {
                    result = index;
                    break;
                }
            }
        }
        if (K != 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
