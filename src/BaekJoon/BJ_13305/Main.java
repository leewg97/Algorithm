package BJ_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class Main {

    public static void main(String[] args) throws IOException {
        /*
        * 리터당 기름 값이 '내림차순'일 경우에 주유하면 된다
        * 결국 최종적으로 우리가 해야할 것은 입력받은 도시별 기름 가격을 내림차순으로 만들어
        * 각 도시별 거리를 곱하여 더해주면 되는 것
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N - 1];
        long[] cost = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 거리 입력
        for (int i = 0; i < N - 1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        // 리터당 기름 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];

        for (int i = 0; i < N - 1; i++) { // 맨 마지막은 필요 없으니까 N - 1
            /*
            * 현재의 주유소가 이전 주유소의 기름값 보다 쌀 경우
            * minCost 갱신
            */
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }
        System.out.println(sum);
    }
 }
