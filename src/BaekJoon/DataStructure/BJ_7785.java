package BaekJoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 회사에 있는 사람
public class BJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String a, b;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            if (b.equals("enter")) set.add(a);
            else set.remove(a);
        }

        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
