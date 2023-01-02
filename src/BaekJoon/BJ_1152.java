package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어의 개수
public class BJ_1152 {

    public static void main(String[] args) throws IOException {
        String inputData = """
The Curious Case of Benjamin Button
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.countTokens());


    }

}
