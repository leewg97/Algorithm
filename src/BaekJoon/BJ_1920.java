package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 찾기
public class BJ_1920 {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        String inputData = """
                5
                4 1 5 2 3
                5
                1 3 7 9 5
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {

        int left = 0;                       // 탐색 범위의 왼쪽 끝 인덱스
        int right = arr.length - 1;         // 탐색 범위의 오른쪽 끝 인덱스

        while (left <= right) {             // lo가 hi보다 커지기 전까지 반복한다.

            int mid = (left + right) / 2;   // 중간위치를 구한다.

            if (key < arr[mid]) {           // key값이 중간 위치의 값보다 작을 경우
                right = mid - 1;
            } else if (key > arr[mid]) {    // key값이 중간 위치의 값보다 클 경우
                left = mid + 1;
            } else {                        // key값과 중간 위치의 값이 같을 경우
                return mid;
            }
        }

        // 찾고자 하는 값이 존재하지 않을 경우
        return -1;
    }

}
