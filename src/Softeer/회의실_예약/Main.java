package Softeer.회의실_예약;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 회의실 예약
public class Main {

    public static int N, M, s, t;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        String[] room = new String[N];
        String[] R = new String[M];
        int[][] time = new int[M][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            room[i] = st.nextToken();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            R[i] = st.nextToken();
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}
