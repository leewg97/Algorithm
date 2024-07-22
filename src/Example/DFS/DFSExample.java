package Example.DFS;

public class DFSExample {
    // 방향 배열: 상, 하, 좌, 우
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {

        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        dfs(maze, 0, 0, visited);
    }

    private static void dfs(int[][] maze, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 1 || visited[x][y]) return;

        visited[x][y] = true;
        System.out.println("Visited: (" + x + ", " + y + ")");

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            dfs(maze, newX, newY, visited);
        }
    }
}
