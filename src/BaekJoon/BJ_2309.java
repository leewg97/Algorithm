package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
public class BJ_2309 {
    public static void main(String[] args) throws IOException {
        String inputData = """
        20
        7
        23
        19
        10
        15
        25
        8
        13
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }
        Arrays.sort(height);

        int fake1 = 0;
        int fake2 = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if ((sum - height[i] - height[j]) == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < height.length; i++) {
            if ((i == fake1) || (i == fake2)) {
                continue;
            }
            System.out.println(height[i]);
        }
    }
}
