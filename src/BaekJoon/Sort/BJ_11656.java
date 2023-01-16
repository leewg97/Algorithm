package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 접미사 배열
public class BJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] ans = new String[str.length()];

        ans[0] = str;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = str.substring(i, ans.length);
        }

        Arrays.sort(ans);

        for (String string : ans) {
            System.out.println(string);
        }
    }

}
