package BaekJoon.BFS.나이트의_이동_BJ_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static final int[] dx = {2, 1, 2, 1, -2, -1, -2, -1};
    private static final int[] dy = {-1, -2, 1, 2, -1, -2, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            int I = Integer.parseInt(br.readLine());

            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int currentX = Integer.parseInt(st1.nextToken());
            int currentY = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int resultX = Integer.parseInt(st2.nextToken());
            int resultY = Integer.parseInt(st2.nextToken());

            System.out.println(bfs(I, currentX, currentY, resultX, resultY));
        }
    }

    private static int bfs(int I, int startX, int startY, int endX, int endY) {
        boolean[][] visited = new boolean[I][I];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0}); // (x, y, 거리)
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            // 목표 위치에 도달한 경우
            if (x == endX && y == endY) return dist;

            // 나이트의 가능한 이동
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < I && ny >= 0 && ny < I && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1}); // 거리 증가
                }
            }
        }
        return -1; // 도달할 수 없는 경우 (문제에서는 항상 도달 가능하다고 가정)
    }
}
