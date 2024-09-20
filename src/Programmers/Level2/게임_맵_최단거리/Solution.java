package Programmers.Level2.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /**
     * 프로그래밍에서의 2차원 배열의 좌표 체계 :  <br>
     * 배열에서 일반적으로 <strong>행(row)</strong>이 세로 방향이고, <strong>열(column)</strong>이 가로 방향임. <br>
     * 배열에서의 x는 행을 나타내고, y는 열을 나타냄. <br>
     * <p>
     * (0, 1): 오른쪽으로 이동 (Y 좌표가 +1 증가)<br>
     * (1, 0): 아래쪽으로 이동 (X 좌표가 +1 증가)<br>
     * (0, -1): 왼쪽으로 이동 (Y 좌표가 -1 감소)<br>
     * (-1, 0): 위쪽으로 이동 (X 좌표가 -1 감소)
     * </p>
     */
    // 상하좌우 이동을 위한 방향 벡터
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length;    // 행의 개수
        int m = maps[0].length; // 열의 개수

        boolean[][] visited = new boolean[n][m]; // 방문 여부

        // BFS를 위한 Queue 생성
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // x, y, 지금까지 이동한 거리 : 시작점 (0,0) 에서 시작하므로 초기 거리 1
        visited[0][0] = true;

        // BFS 탐색
        Integer dist = bfs(maps, queue, n, m, visited);
        return dist != null ? dist : -1;
    }

    private static Integer bfs(int[][] maps, Queue<int[]> queue, int n, int m, boolean[][] visited) {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            // 목표 위치에 도착한 경우
            if (x == n - 1 && y == m - 1) return dist;

            // 상하좌우로 이동 가능한 경우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵 범위 내에 있고, 벽이 아니며, 방문하지 않은 곳인 경우
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true; // 방문 처리
                    queue.offer(new int[]{nx, ny, dist + 1}); // 다음 위치와 거리 큐에 추가
                }
            }
        }
        return null;
    }
}
