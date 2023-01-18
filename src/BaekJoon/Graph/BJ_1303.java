package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 전투
public class BJ_1303 {
    static char[][] board;
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        for (int i = 0; i < M; i ++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                board[j][i] = line.charAt(j);
            }
        }

        int white = 0;
        int black = 0;
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    if (board[i][j] == 'W') {
                        white += Math.pow(dfs(i, j, board[i][j]), 2);
                    } else {
                        black += Math.pow(dfs(i, j, board[i][j]), 2);
                    }
                }
            }
        }
        System.out.println(white + " " + black);
    }

    static int dfs(int x, int y, char color) {
        int count = 1;
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ((0 <= nx && 0 <= ny) && (nx < N && ny < M) && (board[nx][ny] == color) && !visited[nx][ny]) {
                count += dfs(nx, ny, color);
            }
        }
        return count;
    }
}
