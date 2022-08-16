package BJ_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = factorial(N);
        System.out.println(sum);
    }

    private static int factorial(int N) {
        if(N<=1){
            return 1;
        } else {
            return N*factorial(N-1);
        }
    }
}
