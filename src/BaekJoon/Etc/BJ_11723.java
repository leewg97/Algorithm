package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 집합
public class BJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;

            switch (str) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    set.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    set.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(set.contains(num) ? "1" : "0").append('\n');
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++)
                        set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
