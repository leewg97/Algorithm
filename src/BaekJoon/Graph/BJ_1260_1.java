package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS와 BFS
public class BJ_1260_1 {

    static int N, M, V;
    static int[][] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }

        check = new boolean[N + 1];
        dfs(V);
        sb.append('\n');

        check = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        check[start] = true;
        sb.append(start).append(" ");

        for (int i = 0; i <= N; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start).append(" ");

            for (int i = 0; i <= N; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
