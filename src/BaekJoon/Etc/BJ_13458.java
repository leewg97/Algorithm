package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시험 감독
public class BJ_13458 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        5
        1000000 1000000 1000000 1000000 1000000
        5 7
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // 내가 짠 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken()); // 총 감독관 관리가능 인원(총 감독은 1명)
        int C = Integer.parseInt(st.nextToken()); // 부 감독관 관리가능 인원

        long result = 0;

        for (int i = 0; i < N; i++) {
            int a = arr[i] -= B; // 총 감독관 넣기
            result++;

            if (a <= 0) continue;

            if (a % C == 0) {
                result += a / C;    // 남은 인원과 부 감독관 관리 가능 인원 맞아 떨어질 때
            } else {
                result += a / C;    // 다 넣고 남으면 부 감독관 1명 더 넣기
                result++;
            }
        }
        System.out.println(result);


        // 강사님이 짠 코드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] A = new int[N];
//        long count = 0;
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        st = new StringTokenizer(br.readLine());
//        int B = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());
//
//        for (int i = 0; i < N; i++) {
//            if (A[i] > B) {
//                A[i] -= B;
//                count += 1;
//
//                if ((A[i] % C) == 0) {
//                    count += A[i] / C;
//                } else {
//                    count += (A[i] / C) + 1;
//                }
//
//            } else {
//                count += 1;
//            }
//        }
//        System.out.println(count);

    }
}

