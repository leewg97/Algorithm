package Etc;

import java.util.Scanner;

// [이코테] 음료수 얼려먹기
public class Freezing_Drinks {

    public static int N, M;
    static int[][] arr = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        // 모든 노드에 대해 음료수 채우기
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean dfs(int x, int y) {
        // 주어진 범위 밖 종료 조건
        if (x <= -1 || x >= N || y <= -1 || y >= M) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (arr[x][y] == 0) {
            // 방문처리
            arr[x][y] = 1;
            // 상하좌우 위치 재귀 호출
            dfs(x, y + 1);
            dfs(x, y - 1);
            dfs(x - 1, y);
            dfs(x + 1, y);
            return true;
        }
        return false;
    }
}
