package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 뒤집기
public class BJ_1439 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        11001100110011000001
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringTokenizer st1 = new StringTokenizer(S, "0");
        StringTokenizer st0 = new StringTokenizer(S, "1");

        System.out.println(Math.min(st1.countTokens(), st0.countTokens()));
    }
}
