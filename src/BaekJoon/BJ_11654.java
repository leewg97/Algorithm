package BaekJoon;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

// 아스키 코드
public class BJ_11654 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        A
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        Scanner sc = new Scanner(System.in);

        int ch = sc.next().charAt(0);

        System.out.println(ch);

    }
}
