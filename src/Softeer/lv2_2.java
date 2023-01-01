package Softeer;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 장애물 인식 프로그램
public class lv2_2 {

    public static int N;
    public static int[][] arr;
    public static boolean[][] vtd;
    public static ArrayList<Integer> list;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {

        String inputData = """
                7
                1110111
                0110101
                0110101
                0000100
                0110000
                0111110
                0110000
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        vtd = new boolean[N][N];
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < N; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!vtd[i][j] && arr[i][j] == 1) {
                    count++;
                    solve(i, j);
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) sb.append(integer).append("\n");
        System.out.println(sb);
    }

    public static void solve(int pp, int qq) {
        Queue<int[]> q = new LinkedList<>();
        vtd[pp][qq] = true;
        q.add(new int[]{pp, qq});

        int size = 1;
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] == 0 || vtd[nx][ny]) continue;
                else {
                    vtd[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    size++;
                }
            }
        }
        list.add(size);
    }

}
