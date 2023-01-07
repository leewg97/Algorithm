package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

// 문자열 집합
public class BJ_14425 {

    static int N, M;
    static HashSet<String> hashSet = new HashSet<>();
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hashSet.add(st.nextToken());
        }

        String str = "";
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        System.out.println(arrayList.size());
    }
}
