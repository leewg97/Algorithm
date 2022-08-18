package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());

        int[] array = new int[11];

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        int A = 0;
        for (int i = 0; i < data; i++) {
            A = Integer.parseInt(br.readLine());
            for (int j = 4; j <= A; j++) {
                array[j] = array[j - 1] + array[j - 2] + array[j - 3];
            }
            System.out.println(array[A]);
        }
    }






    // RecursiveFunction(재귀함수)
    public int recursiveFunc(int data) {
        if (data == 1) {
            return 1;
        } else if (data == 2) {
            return 2;
        } else if (data == 3) {
            return 4;
        }
        return this.recursiveFunc(data - 1) + this.recursiveFunc(data - 2) + this.recursiveFunc(data - 3);
    }
}
