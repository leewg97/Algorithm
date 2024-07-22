package Softeer.개표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int quotient = n / 5;
            int remainder = n % 5;
            StringBuilder sb = new StringBuilder();
            sb.append("++++ ".repeat(Math.max(0, quotient)));
            sb.append("|".repeat(Math.max(0, remainder)));
            System.out.println(sb);
        }

    }
}
