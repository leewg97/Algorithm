package BJ_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=0; i <= n; i++){

            int number = i;
            int sum = 0;

            while (number != 0){
                sum += number % 10; // number 를 10으로 나눈 나머지를 sum 에 더함
                number /= 10;       // number 를 10으로 나눈 몫을 다시 num 에 저장. 즉, 1의 자리부터 한칸씩 위로
            }
            if (sum + i == n){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
