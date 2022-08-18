package BaekJoon;

import java.io.*;

// 회문
// 아직 잘 모르겠다.. 복습!
public class BJ_17609 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        7
        abba
        summuus
        xabba
        xabbay
        comcom
        comwwmoc
        comwwtmoc           
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int index = 0; index < T; index++) {
            String N = br.readLine();
            System.out.println(InPalindrome(N));
        }
    }

    public static int InPalindrome(String word) {
        String candidate;
        String reverse;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) == word.charAt(right)) {
                left += 1;
                right -= 1;
            } else {
                if (left < right - 1) {
                    candidate = new StringBuilder(word).deleteCharAt(right).toString();
                    reverse = new StringBuilder(candidate).reverse().toString();
                    if (candidate.equals(reverse)) {
                        return 1; // 유사 회문
                    }
                }
                if (left + 1 < right) {
                    candidate = new StringBuilder(word).deleteCharAt(left).toString();
                    reverse = new StringBuilder(candidate).reverse().toString();
                    if (candidate.equals(reverse)) {
                        return 1; // 유사 회문
                    }
                }
                return 2; // 아무것도 아닌 것
            }
        }
        return 0; // 회문
    }

}
