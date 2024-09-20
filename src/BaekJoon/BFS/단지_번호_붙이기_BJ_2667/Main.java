package BaekJoon.BFS.단지_번호_붙이기_BJ_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int T;
    private static int[][] maps;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        maps = new int[T][T];
        visited = new boolean[T][T];

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            for (int j = 0; j < T; j++) maps[i][j] = line.charAt(j) - '0';  //문자에서 정수로 변환
        }

        List<Integer> houseCnt = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (maps[i][j] == 1 && !visited[i][j]) houseCnt.add(bfs(i, j));
            }
        }

        // 결과 출력
        System.out.println(houseCnt.size());
        houseCnt.sort(Integer::compareTo);
        houseCnt.forEach(System.out::println);
    }

    private static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        int count = 1; // 집의 수

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < T && ny >= 0 && ny < T && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                    count++;
                }
            }
        }
        return count;
    }
}
