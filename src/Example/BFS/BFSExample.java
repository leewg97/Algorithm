package Example.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BFSExample {
    // 방향 배열: 상, 하, 좌, 우
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {

        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };
        // BFS 탐색 시작 (0,0)에서 (4,4)까지
        bfs(maze, 0, 0);
    }

    private static void bfs(int[][] maze, int startX, int startY) {
        int n = maze.length;
        int m = maze[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println("Visited: (" + current.x + ", " + current.y + ")");

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && maze[newX][newY] == 0 && !visited[newX][newY]) {
                    queue.add(new Node(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
    }
}
