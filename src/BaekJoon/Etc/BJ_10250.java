package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔
public class BJ_10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*테스트 케이스 만큼 출력을 반복적으로 해야하기 때문에
        StringBuilder 을 사용하여 출력할 문자열들을 하나로 묶어주고, 마지막에 한 번에 출력*/
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());
            st.nextToken(); // W 는 필요 없음
            int N = Integer.parseInt(st.nextToken());

            if (N % H == 0) {   // 호수가 최소 100의 자리부터 시작하므로 *100
                sb.append((H * 100) + (N / H)).append('\n');
            } else {
                sb.append(((N % H) * 100) +((N / H) + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
