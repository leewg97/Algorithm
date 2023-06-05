package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 베스트 셀러
public class BJ_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();

            if (!map.containsKey(name)) map.put(name, 1);
            else map.put(name, map.get(name) + 1);
        }

        int max = 0;
        for (String var : map.keySet()) {
            max = Math.max(max, map.get(var));
        }

        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList);

        for (String var : arrayList) {
            if (map.get(var) == max) {
                System.out.println(var);
                break;
            }
        }
    }
}
